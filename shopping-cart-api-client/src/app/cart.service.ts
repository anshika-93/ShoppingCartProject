import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({ providedIn: 'root' })
export class CartService {
  private baseUrl = 'http://localhost:8080/cart'; // Java backend

  constructor(private http: HttpClient) {}

  addItem(item: string): Observable<any> {
    return this.http.post(`${this.baseUrl}/item`, { item }, { responseType: 'text' });
  }

  getCart(): Observable<string[]> {
    return this.http.get<string[]>(this.baseUrl);
  }

  getTotal(): Observable<{ total: number }> {
    return this.http.get<{ total: number }>(`${this.baseUrl}/total`);
  }
}
