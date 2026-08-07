package org.godotengine.godot.plugin;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.u;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.godotengine.godot.Godot;

/* JADX INFO: loaded from: classes10.dex */
public final class GodotPluginRegistry {
    private static final String GODOT_ENABLED_PLUGINS_LABEL = "plugins";
    private static final String GODOT_PLUGIN_V1_NAME_PREFIX = "org.godotengine.plugin.v1.";
    private static final String PLUGIN_VALUE_SEPARATOR_REGEX = "\\|";
    private static final String TAG = "GodotPluginRegistry";
    private static GodotPluginRegistry instance;
    private final ConcurrentHashMap<String, GodotPlugin> registry = new ConcurrentHashMap<>();

    private GodotPluginRegistry(Godot godot) {
        loadPlugins(godot);
    }

    public static GodotPluginRegistry getPluginRegistry() {
        GodotPluginRegistry godotPluginRegistry = instance;
        if (godotPluginRegistry != null) {
            return godotPluginRegistry;
        }
        throw new IllegalStateException("Plugin registry hasn't been initialized.");
    }

    public static GodotPluginRegistry initializePluginRegistry(Godot godot) {
        if (instance == null) {
            instance = new GodotPluginRegistry(godot);
        }
        return instance;
    }

    private void loadPlugins(Godot godot) {
        HashSet hashSet;
        try {
            u activity = godot.getActivity();
            Bundle bundle = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData;
            if (bundle != null && !bundle.isEmpty()) {
                if (bundle.containsKey(GODOT_ENABLED_PLUGINS_LABEL)) {
                    String[] strArrSplit = bundle.getString(GODOT_ENABLED_PLUGINS_LABEL, "").split(PLUGIN_VALUE_SEPARATOR_REGEX);
                    if (strArrSplit.length == 0) {
                        return;
                    }
                    hashSet = new HashSet();
                    for (String str : strArrSplit) {
                        hashSet.add(str.trim());
                    }
                } else {
                    hashSet = null;
                }
                for (String str2 : bundle.keySet()) {
                    if (str2.startsWith(GODOT_PLUGIN_V1_NAME_PREFIX)) {
                        String strTrim = str2.substring(26).trim();
                        if (hashSet == null || hashSet.contains(strTrim)) {
                            String str3 = TAG;
                            Log.i(str3, "Initializing Godot plugin " + strTrim);
                            String string = bundle.getString(str2);
                            if (TextUtils.isEmpty(string)) {
                                Log.w(str3, "Invalid plugin loader class for " + strTrim);
                            } else {
                                try {
                                    try {
                                        GodotPlugin godotPlugin = (GodotPlugin) Class.forName(string).getConstructor(Godot.class).newInstance(godot);
                                        if (!strTrim.equals(godotPlugin.getPluginName())) {
                                            Log.w(str3, "Meta-data plugin name does not match the value returned by the plugin handle: " + strTrim + " =/= " + godotPlugin.getPluginName());
                                        }
                                        this.registry.put(strTrim, godotPlugin);
                                        Log.i(str3, "Completed initialization for Godot plugin " + godotPlugin.getPluginName());
                                    } catch (InstantiationException e11) {
                                        Log.w(TAG, "Unable to load Godot plugin " + strTrim, e11);
                                    } catch (InvocationTargetException e12) {
                                        Log.w(TAG, "Unable to load Godot plugin " + strTrim, e12);
                                    }
                                } catch (ClassNotFoundException e13) {
                                    Log.w(TAG, "Unable to load Godot plugin " + strTrim, e13);
                                } catch (IllegalAccessException e14) {
                                    Log.w(TAG, "Unable to load Godot plugin " + strTrim, e14);
                                } catch (NoSuchMethodException e15) {
                                    Log.w(TAG, "Unable to load Godot plugin " + strTrim, e15);
                                }
                            }
                        } else {
                            Log.w(TAG, "Plugin " + strTrim + " is listed in the dependencies but is not enabled.");
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e16) {
            Log.e(TAG, "Unable load Godot Android plugins from the manifest file.", e16);
        }
    }

    public Collection<GodotPlugin> getAllPlugins() {
        return this.registry.values();
    }

    public GodotPlugin getPlugin(String str) {
        return this.registry.get(str);
    }
}
