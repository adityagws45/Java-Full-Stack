package com.string;

public class StringBufferVsStringBuilderDemo {
	public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" Buffer");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Builder");
        System.out.println(builder);

        /*
         OUTPUT:
         Hello Buffer
         Hello Builder
        */
    }
}
