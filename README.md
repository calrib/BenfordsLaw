# BenfordsLaw
Benford’s law says that the first digits of a collection of measurements are not uniform across 1,2,3,4,5,6,7,8,9 as one might expect. In fact, we can expect to see ‘1’ not 1/9 of the time but almost 1/3 of the time as the most significant digit.  Ideally, the distribution looks something like:

| digit | frequency |
| ----- | --------- |
| 1     | 30.1%     |
| 2     | 17.6%     |
| 3     | 12.5%     |
| 4     | 9.7%      |
| 5     | 7.9%      |
| 6     | 6.7%      |
| 7     | 5.8%      |
| 8     | 5.1%      |
| 9     | 4.6%      |

With the the mean digit being 3.44 and standard deviation being 2.46

The class Benford reads numbers from standard input and prints out only the first digit of those numbers.

The class Hist, creates a Histogram: each printed line describes the range and the proportion of data in that bin. This proportion is indicated by the frequency and a series of asterisks as a low-tech visualization. 

The Stats class reports useful statistics like the minimum, maximum, mean, and standard deviation.


