class BirdCount
{
    private int[] birdsPerDay;

    public BirdCount(int[] birdsPerDay)
    {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] LastWeek()
    {
        int[] lastWeek = { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeek;
    }

    public int Today()
    {
        return birdsPerDay.Last();
    }

    public void IncrementTodaysCount()
    {
        birdsPerDay[6]++;
    }

    public bool HasDayWithoutBirds()
    {
        var daysWithoutBirds = birdsPerDay.IndexOf(0);
        if (daysWithoutBirds >= 0)
            return true;
        return false;
    }

    public int CountForFirstDays(int numberOfDays)
    {
        var count = 0;
        for(int i = 0; i < numberOfDays; i++)
        {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int BusyDays()
    {
        return birdsPerDay.Count(day => day >= 5);
    }
}
