package com.uce.edu.demo.tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Uso de IoC
@Service
public class VenderProductoMetodoSET {

	private Cliente cliente;
	private Vendedor vendedor;
	private Producto producto;
	
	public void vender(String nombreCliente, String cedula, String nomProducto, 
			String codProducto,Double precio, String nomVendedor, String codVendedor) {
		
		this.cliente.setNombre(nombreCliente);
		this.cliente.setCedula(cedula);
		
		this.vendedor.setNombre(nomVendedor);
		this.vendedor.setCodVendedor(codVendedor);
		
		this.producto.setNombreProdu(nomProducto);
		this.producto.setCodProducto(codProducto);
		this.producto.setPrecio(precio);
		
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "VenderProductoMetodoSET [cliente=" + cliente + ", vendedor=" + vendedor + ", producto=" + producto
				+ "]";
	}

	//SET y GET
	//3) DI por metodos SET
	public Cliente getCliente() {
		return cliente;
	}
	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	@Autowired
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}
	@Autowired
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
