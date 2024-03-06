package com.tatiana.project.lesson11.images;

public final class Editor implements Cloneable {
    private Drawable drawable;

    public Editor(Drawable drawable) {
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable){
        this.drawable = drawable;
    }

    public void show(){
        drawable.draw();
    }

   @Override
    public Editor clone() {
        try {
            Editor copy = (Editor) super.clone();
            if (this.drawable != null) {
                copy.drawable = (Drawable) this.drawable.clone();
            }
            return copy;
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не поддерживается");
            return null;
        }
    }

    /* @Override

    public Object clone() throws CloneNotSupportedException {
        Editor cloned = (Editor) super.clone();
        cloned.drawable= (Drawable) drawable.clone();
        return cloned;
    } */

}