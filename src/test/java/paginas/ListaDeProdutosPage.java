package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage {
    private WebDriver navegador;

    public ListaDeProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioDeAdicaoDeProdutoPage acessarFormularioDeAdicaoNovoProduto() {
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();
        return new FormularioDeAdicaoDeProdutoPage(navegador);
    }

    public String capturarMensagemApresentada() {
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}

