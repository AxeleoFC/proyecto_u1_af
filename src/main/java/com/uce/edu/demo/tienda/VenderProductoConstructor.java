package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Service;
//Uso de IoC
@Service
public class VenderProductoConstructor {
	
		private Cliente cliente;
		private Vendedor vendedor;
		private Producto producto;
		
		//2) DI por constructor
		public VenderProductoConstructor(Cliente cliente, Vendedor vendedor, Producto producto) {
			// TODO Auto-generated constructor stub
			this.cliente=cliente;
			this.vendedor=vendedor;
			this.producto=producto;
		}
		
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
			return "VenderProductoConstructor [cliente=" + cliente + ", vendedor=" + vendedor + ", producto=" + producto
					+ "]";
		}

		//SET y GET
		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Vendedor getVendedor() {
			return vendedor;
		}

		public void setVendedor(Vendedor vendedor) {
			this.vendedor = vendedor;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

}
