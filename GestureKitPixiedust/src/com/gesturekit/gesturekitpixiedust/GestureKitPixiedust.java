package com.gesturekit.gesturekitpixiedust;

import java.util.Map;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.gesturekit.gesturekitpixiedust.particles.ParticleViewTexture;
import com.roamotuch.gesturekit.plugin.PluginInterface;
import com.roamtouch.gesturekit.GestureKit;
import com.roamtouch.gesturekit.data.PluginParams;

public class GestureKitPixiedust extends FrameLayout implements PluginInterface {
	
	private ParticleViewTexture particles;
	
	// GestureKit Plugin Params 
	private PluginParams pluginparams = new PluginParams();

	public GestureKitPixiedust(Context context, GestureKit gesturekit) {
		super(context);	
		
		particles = new ParticleViewTexture(context, this, gesturekit);			
		particles.serGestureKit(gesturekit);
		
		// Plugin Params Defintion
	    this.pluginparams.GESTUREKIT_ENABLE_GRID = false;
		//this.pluginparams.GESTUREKIT_HELPER_POPUP_MODE = true;
		//this.pluginparams.GESTUREKIT_HELPER_ANIMATION_MODE = false;
				
	}

	@Override
	public void onGesturesIcon(GestureKit gk, Map<String, String> icons) {		
		
	}

	@Override
	public void proccessTouchEvent(MotionEvent event) {		
		
		if (particles != null)
		{
			particles.onTouch(event);
		}
		
	}

	@Override
	public void clear() {		
		
	}

	@Override
	public void showErrorLogo() {		
		
	}

	@Override
	public void showLoadingLogo() {		
		
	}

	@Override
	public void showOkLogo() {		
		
	}

	@Override
	public void setPluginParams(PluginParams params) {		
		this.pluginparams = params;	
	}

	@Override
	public PluginParams getPluginParams() {		
		return this.pluginparams;
	}

}
