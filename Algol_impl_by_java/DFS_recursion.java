package Algol_impl_by_java;
/**
 * https://codingnojam.tistory.com/44
 * 여기 코드는 좀 많이 생략해서 표현한 코드.
 * 이 코드보고 문제풀지 말고 이 코드에서 응용 많이 해야 풀 수 있을듯.
 */
public class DFS_recursion {

    // 방문처리에 사용 할 배열선언
    static boolean[] vistied = new boolean[9];

    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIndex) {
        // 방문 처리
        vistied[nodeIndex] = true;

        // 방문 노드 출력
        System.out.print(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph[nodeIndex]) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]) {
                dfs(node);
            }
        }
    }
}