import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  productList: Product[] = [];
  showUpdateForm: boolean = false;
  updatedProduct: Product = { id: 0, name: '', price: 0 };
  searchName: string = '';
  constructor(private productService: ProductService)
  {
    
  }
  getAllProducts(){
    this.productService.getAll().subscribe((products) =>{this.productList=products
    console.log(products);
    });
  }
  deleteById(id: number){
    this.productService.deleteProductById(id);
  }
   UpdateForm(product: Product) {
    this.updatedProduct = { ...product }; // Create a copy of the product to avoid changing it directly
    this.showUpdateForm = !this.showUpdateForm;
  }

  updateProduct() {
    this.productService.updateByProductId(this.updatedProduct).subscribe(updatedProduct => {
      const index = this.productList.findIndex(product => product.id === updatedProduct.id);
      this.productList[index] = updatedProduct;
      this.showUpdateForm = false;
      alert("Product updated");
    });
  }
  searchProductByName() {
    if (this.searchName.trim() !== '') {
      this.productService.getProductByName(this.searchName.trim()).subscribe(products => {
        if (products.length === 0) {
          this.productList = [];
          alert('No results found for the given search name.');
        } else {
          this.productList = products;
        }
      });
    } 
  }
}