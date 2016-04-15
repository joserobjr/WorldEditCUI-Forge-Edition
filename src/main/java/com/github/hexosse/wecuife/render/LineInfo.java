package com.github.hexosse.wecuife.render;

import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glLineWidth;

/**
 * Stores data about a line that can be rendered
 * 
 * @author lahwran
 * @author yetanotherx
 * 
 */
public class LineInfo
{
	
	public float lineWidth;
	public float red;
	public float green;
	public float blue;
	public float alpha;

	public LineInfo(float lineWidth, float r, float g, float b, float a)
	{
		this.lineWidth = lineWidth;
		this.red = r;
		this.green = g;
		this.blue = b;
		this.alpha = a;
	}
	
	public LineInfo(float lineWidth, float r, float g, float b)
	{
		this(lineWidth, r, g, b, 1.0f);
	}
	
	public LineInfo(LineInfo orig)
	{
		this.lineWidth = orig.lineWidth;
		this.red = orig.red;
		this.green = orig.green;
		this.blue = orig.blue;
		this.alpha = orig.alpha;
	}
	
	/**
	 * Sets the lineWidth based on this colour
	 */
	public void prepareRender()
	{
		glLineWidth(this.lineWidth);
	}
	
	public void prepareColour()
	{
		glColor4f(this.red, this.green, this.blue, this.alpha);
	}
}
