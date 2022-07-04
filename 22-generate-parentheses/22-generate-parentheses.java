class Solution {
  public List<String> generateParenthesis(int numPairs) {
    List<String> result = new ArrayList<>();
    directedGenerateBalancedParentheses(numPairs, numPairs, "", result);
    return result;
  }
  private void directedGenerateBalancedParentheses(
    int numLeftParensNeeded,
    int numRightParensNeeded,
    String parenStringInProgress,
    List<String> result) {
    if (numLeftParensNeeded == 0 && numRightParensNeeded == 0) {
      result.add(parenStringInProgress);
      return;
    }
    if (numLeftParensNeeded > 0) {
      directedGenerateBalancedParentheses(
        numLeftParensNeeded - 1,
        numRightParensNeeded,
        parenStringInProgress + "(",
        result
      );
    }
    if (numLeftParensNeeded < numRightParensNeeded) {
      directedGenerateBalancedParentheses(
        numLeftParensNeeded,
        numRightParensNeeded - 1,
        parenStringInProgress + ")",
        result
      );
    }
  }
}