import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseUrl = 'http://localhost:3000/products/';
  constructor(private _http:HttpClient) 
  { 
     
  }

  getAll():Observable<Product[]>{
    return this._http.get<Product[]>(this.baseUrl); 
  }
insertProduct(product:Product)
{
  this._http.post<Product>(this.baseUrl,product)
  .subscribe((response=>{console.log('product addded')}))
}
deleteProductById(id: number) {
  {

      this._http.delete<Product>(this.baseUrl+id)
        .subscribe( (data) => { console.log(id +"record deleted");}, err => { console.log(err)});

  }
}
updateByProductId(product: Product): Observable<Product> {
  return this._http.put<Product>(this.baseUrl + product.id, product);
}
getProductByName(name: string): Observable<Product[]> {
  return this._http.get<Product[]>(this.baseUrl + '?name=' + name);
}

}