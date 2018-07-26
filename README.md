# all-permutations-of-a-given-string

```
    private static void permute(String str, int i, int j) {
      if (i == j)
        System.out.println(str);
      else {
        for (int k = i; k <= j; k++) {
          str = swap(str, i, k);
          permute(str, i+1, j);
          str = swap(str, i, k);
        }

      }
	}
```
