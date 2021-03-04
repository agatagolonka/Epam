package com.epam.test.automation.java.practice5;


public class ArrayRectangles {
    private Rectangle[] rectangleArray;
    
    public ArrayRectangles(int n) {
        this.rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangleArray) {

        this.rectangleArray = rectangleArray;
    }
    
    public boolean addRectangle(Rectangle rectangle) {
        
        for(int i = 0;i<this.rectangleArray.length;i++){
            
            if(this.rectangleArray[i]==null){
                this.rectangleArray[i]=rectangle;
                return true;
                
            }
        }
       
       
        return false;
        
    }

   
    public int numberMaxArea() {
        int indexMax=0;
        double maxArea=this.rectangleArray[0].area();
        for(int i=0;i<this.rectangleArray.length;i++){
            if(this.rectangleArray[i].area()>maxArea){
                maxArea=this.rectangleArray[i].area();
                indexMax=i;
            }
        }

                return indexMax;
    }

    
    public int numberMinPerimeter() {
       int indexMin=0;
        double minRerimeter=this.rectangleArray[0].perimeter();
        for(int i=0;i<this.rectangleArray.length;i++){
            if(this.rectangleArray[i].perimeter()<minRerimeter){
                minRerimeter=this.rectangleArray[i].perimeter();
                indexMin=i;
            }
        }

        return indexMin;
    }

    
    public int numberSquares() {
        int numSquares=0;
        for(int i=0;i<this.rectangleArray.length;i++){
            if(this.rectangleArray[i].isSquare()){
                numSquares=numSquares+1;
            }
        }
        return numSquares;
    }

}
