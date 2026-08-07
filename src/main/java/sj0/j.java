package sj0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class j implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderScript f111309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f111310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f111311d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f111308a = new Paint(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111312e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111313f = -1;

    public j(@NonNull Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f111309b = renderScriptCreate;
        this.f111310c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    private boolean f(@NonNull Bitmap bitmap) {
        return bitmap.getHeight() == this.f111313f && bitmap.getWidth() == this.f111312e;
    }

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
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f111308a);
    }

    @Override // sj0.a
    public final void destroy() {
        this.f111310c.destroy();
        this.f111309b.destroy();
        Allocation allocation = this.f111311d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // sj0.a
    public Bitmap e(@NonNull Bitmap bitmap, float f11) {
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f111309b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f111311d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f111311d = Allocation.createTyped(this.f111309b, allocationCreateFromBitmap.getType());
            this.f111312e = bitmap.getWidth();
            this.f111313f = bitmap.getHeight();
        }
        this.f111310c.setRadius(f11);
        this.f111310c.setInput(allocationCreateFromBitmap);
        this.f111310c.forEach(this.f111311d);
        this.f111311d.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }
}
