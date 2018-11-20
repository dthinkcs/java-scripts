import java.util.*;
import java.io.*;

class Frequency implements Serializable
{
	String s;
	int n;

	Frequency(String a, int b)
	{
		s = a;
		n = b;
	}
}

class SortByFreq implements Comparator<Frequency>
{
	public int compare(Frequency a, Frequency b)
	{
		return a.n - b.n;
	}
}

class AddSeven
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		try
		{
			FileOutputStream f = new FileOutputStream("addsevenread.txt");
			System.out.println("Enter data to write to file. Enter done to terminate.");
			while(true)
			{
				String x = s.nextLine();
				if(x.equals("done")) break;
				else f.write(x.toLowerCase().getBytes());
				f.write(" ".getBytes());
			}

			f.close();
		}

		catch(Exception e)
		{
			System.out.println("Writing error to initial file. " + e);
		}

		ArrayList<String> x = new ArrayList<String>();

		try
		{
			FileInputStream f = new FileInputStream("addsevenread.txt");
			StringBuffer sb = new StringBuffer();
			int i = 0;

			while((i = f.read()) != -1)
			{
				if((char)i == ' ')
				{
					x.add(sb.toString());
					sb.setLength(0);
				}
				sb.append((char)i);
			}

			f.close();
		}

		catch(Exception e)
		{
			System.out.println("Reading error from initial file " + e);
		}

		String[] arr = x.toArray(new String[x.size()]);
		Arrays.sort(arr);

		ArrayList<Frequency> f1 = new ArrayList<Frequency>();

		int start = 0;

		for(int i = 0; i < arr.length - 1; i++)
		{
			if(!arr[i].equals(arr[i + 1]))
			{
				f1.add(new Frequency(arr[i], i - start + 1));
				start = i + 1;
			}
		}

		if(f1.indexOf(arr[arr.length - 1]) == -1) f1.add(new Frequency(arr[arr.length - 1], 1));
		else
		{
			Frequency obj = f1.remove(f1.size() - 1);
			f1.add(new Frequency(obj.s, obj.n + 1));
		}

		Frequency[] a = f1.toArray(new Frequency[f1.size()]);

		try
		{
			FileOutputStream f = new FileOutputStream("addsevenwrite.txt");
			
			for(int i = 0; i < a.length; i++)
			{
				f.write(a[i].s.getBytes());
				f.write(" ".getBytes());
				f.write(String.valueOf(a[i].n).getBytes());
				f.write(" ".getBytes());
			}

			f.write(("\n").getBytes());

			Arrays.sort(a, new SortByFreq());
			for(int i = 0; i < a.length; i++)
			{
				f.write(a[i].s.getBytes());
				f.write(" ".getBytes());
				f.write(String.valueOf(a[i].n).getBytes());
				f.write(" ".getBytes());
			}
			f.close();
		}

		catch(Exception e)
		{
			System.out.println("Writing error to final file " + e);
		}
	}
}