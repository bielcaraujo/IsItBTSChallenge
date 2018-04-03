/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    boolean checkBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }

    /* Método que volta verdadeiro caso a árvore dada é uma BTS e os valores: Minino e Máximo */
    boolean isBSTUtil(Node node, int min, int max)
    {
        /*Se uma árvore está vazia, ela é BTS */
        if (node == null)
            return true;
        /* Retorna falso caso esse dado em específico violar a min/max constraints  */
        if (node.data < min || node.data > max)
            return false;
        /* Caso não haja resposta anteriormente, analisa a árvore recursivamente */
        // Adminite apenas valores distintos
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }