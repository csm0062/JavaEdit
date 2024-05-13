package chap20_enum;

import chap20_enum.enums.RGB;

public class _05_RgbEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB[] rgbArr = RGB.values();
		
		for(RGB rgb : rgbArr)
		{
			System.out.println(rgb.getColor() + "는 " + rgb.getRed() + ", " + rgb.getGreen() + ", " + rgb.getBlue());
		}

	}

}
