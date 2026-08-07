package fa0;

import com.facebook.react.p0;
import com.tesla.godot.TMGodot;
import com.tesla.godot.TMGodotReactPackage;
import org.godotengine.godot.GodotLib;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lfa0/l;", "", "<init>", "()V", "Lcom/facebook/react/p0;", "a", "()Lcom/facebook/react/p0;", "Ljn0/h0;", "b", "c", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f64736a = new l();

    private l() {
    }

    public final p0 a() {
        return new TMGodotReactPackage();
    }

    public final void b() {
        TMGodot.getInstance(null);
    }

    public final void c() {
        GodotLib.focusout();
    }
}
