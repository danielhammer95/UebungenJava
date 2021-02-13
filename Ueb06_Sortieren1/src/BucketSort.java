public class BucketSort
{
	private Linkable[] buckets;

	public BucketSort(int count)
	{
		this.buckets = new Linkable[count];
	}

	public void addToBucket(Linkable item, int bucket)
	{
		assert(bucket >= 0);
		assert(bucket < buckets.length);

		this.buckets[bucket]=item;
	}

	public void printBucket(int bucket)
	{
		assert(bucket >= 0);
		assert(bucket < buckets.length);

		
		for (int i=0; i<buckets.length; i++)
		{
		System.out.println(this.buckets[i]);
		}
	}
}