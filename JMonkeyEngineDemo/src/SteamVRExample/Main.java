package SteamVRExample;

import com.jme3.app.LostFocusBehavior;
import com.jme3.app.SimpleApplication;
import com.jme3.app.VRAppState;
import com.jme3.app.VRConstants;
import com.jme3.app.VREnvironment;
import com.jme3.app.state.AppState;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

public class Main extends SimpleApplication {

	public Main(AppState... appStates) {
		super(appStates);
	}

	@Override
	public void simpleInitApp() {
		Box b = new Box(1, 1, 1);
		Geometry geom = new Geometry("Box", b);

		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		mat.setColor("Color", ColorRGBA.Blue);
		geom.setMaterial(mat);

		rootNode.attachChild(geom);
	}

	@Override
	public void simpleUpdate(float tpf) {
		// TODO: add update code
	}

	@Override
	public void simpleRender(RenderManager rm) {
		// TODO: add render code
	}

	public static void main(String[] args) {
		AppSettings settings = new AppSettings(true);
		settings.put(VRConstants.SETTING_VRAPI, VRConstants.SETTING_VRAPI_OPENVR_VALUE);
		settings.put(VRConstants.SETTING_ENABLE_MIRROR_WINDOW, true);

		VREnvironment env = new VREnvironment(settings);
		env.initialize();

		// Checking if the VR environment is well initialized
		// (access to the underlying VR system is effective, VR devices are detected).
		if (env.isInitialized()) {
			VRAppState vrAppState = new VRAppState(settings, env);
			vrAppState.setMirrorWindowSize(1024, 800);
			Main app = new Main(vrAppState);
			app.setLostFocusBehavior(LostFocusBehavior.Disabled);
			app.setSettings(settings);
			app.setShowSettings(false);
			app.start();
		}
	}

}