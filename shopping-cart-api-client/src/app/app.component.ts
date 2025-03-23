import {Component, OnInit} from '@angular/core';
import { CartService } from './cart.service';
@Component({
  selector: 'app-root',
  template: ''
})
export class AppComponent implements OnInit{

  constructor(private cartService: CartService) {}
  ngOnInit() {
    // 1. Add items
    this.cartService.addItem('Apple').subscribe(() => console.log('Added Apple'));
    this.cartService.addItem('Melon').subscribe(() => console.log('Added Melon'));

    // 2. Get cart
    this.cartService.getCart().subscribe(cart => {
      console.log('Cart:', cart);
    });

    // 3. Get total
    this.cartService.getTotal().subscribe(data => {
      console.log('Total: £' + data.total.toFixed(2));
    });
  }
}

