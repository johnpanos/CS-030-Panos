package edu.westmont.cs030;
import com.jme3.asset.TextureKey;
import com.jme3.font.BitmapFont;
import com.jme3.font.BitmapText;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Matrix3f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture.WrapMode;

public class MyBox extends Drawable{
	
	static final float characterWidth = 0.7f;
	
	@Override
	public Spatial draw() {
		Node node = new Node();
		
		/* Create a new material for the side of the box*/
		Material boxMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		TextureKey key = new TextureKey("assets/box.jpg");
		key.setGenerateMips(true);
		Texture tex = assetManager.loadTexture(key);
		tex.setWrap(WrapMode.EdgeClamp);
		boxMaterial.setTexture("ColorMap", tex);
		
		/* Create box  */
		float length = 1.0f;
		float height = 1.0f;
		float width = 1.0f;
		float x = 0.0f;
		float y = 0.0f;
		float z = 0.0f;
		Box box = new Box(length/2.0f,height/2.0f,width/2.0f); /* Give it a size */	
		box.scaleTextureCoordinates(new Vector2f(1, 1)); /*Scale the texture */
		Geometry boxGeometry = new Geometry("Box", box);
		boxGeometry.setMaterial(boxMaterial);
		boxGeometry.setShadowMode(ShadowMode.CastAndReceive);
		node.attachChild(boxGeometry);
		node.setLocalTranslation(x, y, z);
		
		return node;
	}

}
