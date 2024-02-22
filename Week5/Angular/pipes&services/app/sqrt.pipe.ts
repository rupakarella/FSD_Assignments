import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sqrt'
})
export class SqrtPipe implements PipeTransform {

  transform(value1: number, ...args: number[]): number {
    return value1*args[0];
  }

}
