package scoket

/**
 * Scoket服务端
 */
class ScoketServer {
     static void main(String[] args) {
        byte[] buffer = new byte[1024]
        try {
            //绑定端口并监听
            ServerSocket serverSocket = new ServerSocket(8080)
            println("服务器已启动并监听8080端口")
            while (true) {
                println()
                println("服务器正在等待连接...")
                //accept阻塞
                Socket socket = serverSocket.accept()
                println("服务器已接收到连接请求...")
                println()
                println("服务器正在等待数据...")
                //获取客户端传输数据
                socket.getInputStream().read(buffer)
                println("服务器已经接收到数据")
                println()
                String content = new String(buffer)
                println("接收到的数据:" + content)
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
    }
}
