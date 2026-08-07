package sj0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import q1.p;

/* JADX INFO: loaded from: classes8.dex */
public class i implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111304c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f111306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f111307f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RenderNode f111302a = p.a("BlurViewNode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f111305d = 1.0f;

    @Override // sj0.a
    @NonNull
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // sj0.a
    public boolean b() {
        return true;
    }

    @Override // sj0.a
    public float c() {
        return 6.0f;
    }

    @Override // sj0.a
    public void d(@NonNull Canvas canvas, @NonNull Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f111302a);
            return;
        }
        if (this.f111306e == null) {
            this.f111306e = new j(this.f111307f);
        }
        this.f111306e.e(bitmap, this.f111305d);
        this.f111306e.d(canvas, bitmap);
    }

    @Override // sj0.a
    public void destroy() {
        this.f111302a.discardDisplayList();
        a aVar = this.f111306e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // sj0.a
    public Bitmap e(@NonNull Bitmap bitmap, float f11) {
        this.f111305d = f11;
        if (bitmap.getHeight() != this.f111303b || bitmap.getWidth() != this.f111304c) {
            this.f111303b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f111304c = width;
            this.f111302a.setPosition(0, 0, width, this.f111303b);
        }
        this.f111302a.beginRecording().drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        this.f111302a.endRecording();
        this.f111302a.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, Shader.TileMode.MIRROR));
        return bitmap;
    }

    void f(@NonNull Context context) {
        this.f111307f = context;
    }
}
