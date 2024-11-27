public class Principal {
    public static void main(String... args) {
        Desconto descfidelidade = new DescontoFidelidade();
        Desconto descPorPeriodo = new DescontoPorPeriodo();
        Desconto descPorVolume = new DescontoPorVolume();

        Pedido pedidoA = new Pedido(descfidelidade);
        Pedido pedidoB = new Pedido(descPorPeriodo);
        Pedido pedidoC = new Pedido(descPorVolume);
        
        double totalPedidoA= 100;
        double totalPedidoB= 300;
        double totalPedidoC= 500;

        double totalComDescontoPedidoA = pedidoA.calcularTotalComDesconto(totalPedidoA);
        double totalComDescontoPedidoB = pedidoB.calcularTotalComDesconto(totalPedidoB);
        double totalComDescontoPedidoC = pedidoC.calcularTotalComDesconto(totalPedidoC);

        System.out.println("Total do pedido A: " + totalPedidoA);
        System.out.println("Total com desconto do pedido A: " + totalComDescontoPedidoA);
        System.out.println("-------------------------");

        System.out.println("Total do pedido B: " + totalPedidoB);
        System.out.println("Total com desconto do pedido B: " + totalComDescontoPedidoB);
        System.out.println("-------------------------");

        System.out.println("Total do pedido C: " + totalPedidoC);
        System.out.println("Total com desconto do pedido C: " + totalComDescontoPedidoC);
        System.out.println("-------------------------");
        
    }
}