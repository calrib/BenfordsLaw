import edu.princeton.cs.algs4.*;

class Stats {
  public static void main(String[] args) {
    double d = StdIn.readDouble();
    double max = d;
    double min = d;
    double total = d;
    double total_sqs = d*d;
    int count = 1;
    while (!StdIn.isEmpty()) {
      d = StdIn.readDouble();
      if (max < d) {
        max = d;
      }
      if (min > d) {
        min = d;
      }
      total += d;
      total_sqs += d*d;
      count++;
    }
    double mean = total / count;
    double stddev = Math.sqrt((total_sqs-total*total/count)/count);
    StdOut.println("Mean: " + mean + "\n" +
                   "Standard Deviation: " + stddev + "\n" +
                   "Minimum: " + min + "\n" +
                   "Maximum: " + max + "\n");
  }
}