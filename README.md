<h2>Merge Sort</h2>
<h3>How this sorting algorithm works?</h3>
<p>
This algorithm uses divide and conquer approach. 
Firstly, the array will be divided into two equal 
parts or almost equal parts until every subarray 
length becomes 1. These subarrays are merged 
by sorting in the order in which they got divided.
Finally, we obtain a sorted array after the merge 
operation is completed.
<br>
For example, consider the array {5,3,2,6,4,8,1,7}
</p>
<h4>The array will be divided as follows:</h4>
<h6>Step-1</h6>
<pre>5 3 2 6     4 8 1 7</pre>
<h6>Step-2</h6>  
<pre>5 3   2 6     4 8   1 7</pre>
<h6>Step-3</h6>
<pre>5  3    2  6     4  8    1  7</pre> 
<br>
<h4>The subarrays will be merged as follows:</h4> 
<h6>Step-1</h6>
<pre>3 5   2 6     4 8   1 7</pre>
<h6>Step-2</h6>
<pre>2 3 5 6     1 4 7 8</pre>
<h6>Step-3</h6>
<pre>1 2 3 4 5 6 7 8</pre>
<br>
<p>
Thus, the sorted array {1,2,3,4,5,6,7,8} is obtained 
using Merge Sort algorithm.
</p>
