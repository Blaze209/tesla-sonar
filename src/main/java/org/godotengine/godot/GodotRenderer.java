package org.godotengine.godot;

import android.opengl.GLSurfaceView;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.GodotPluginRegistry;
import org.godotengine.godot.utils.GLUtils;

/* JADX INFO: loaded from: classes10.dex */
class GodotRenderer implements GLSurfaceView.Renderer {
    private boolean activityJustResumed = false;
    private final GodotPluginRegistry pluginRegistry = GodotPluginRegistry.getPluginRegistry();

    GodotRenderer() {
    }

    void onActivityPaused() {
        GodotLib.onRendererPaused();
    }

    void onActivityResumed() {
        this.activityJustResumed = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.activityJustResumed) {
            GodotLib.onRendererResumed();
            this.activityJustResumed = false;
        }
        GodotLib.step();
        for (int i11 = 0; i11 < Godot.singleton_count; i11++) {
            Godot.singletons[i11].onGLDrawFrame(gl10);
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onGLDrawFrame(gl10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        GodotLib.resize(i11, i12);
        for (int i13 = 0; i13 < Godot.singleton_count; i13++) {
            Godot.singletons[i13].onGLSurfaceChanged(gl10, i11, i12);
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onGLSurfaceChanged(gl10, i11, i12);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GodotLib.newcontext(GLUtils.use_32);
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onGLSurfaceCreated(gl10, eGLConfig);
        }
    }
}
