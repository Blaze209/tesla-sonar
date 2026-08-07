package re0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import fc0.u5;
import gc0.o;
import gc0.u0;
import me0.b0;
import me0.f;
import me0.g;
import me0.i;
import me0.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wb0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lre0/a;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "batteryLevel", "Lxc0/a;", "vehicle", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, Snapshot.WIDTH, Snapshot.HEIGHT, "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;ILxc0/a;Landroid/content/Context;II)V", "Landroid/graphics/Bitmap;", "c", "(Landroid/content/Context;Lxc0/a;)Landroid/graphics/Bitmap;", "b", "Landroid/graphics/Canvas;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f107857a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Canvas canvas = new Canvas();

    private a() {
    }

    private final void a(Canvas canvas2, int batteryLevel, xc0.a vehicle, Context context, int width, int height) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int iA = b0.a(vehicle, context, false);
        int i11 = batteryLevel / 10;
        int i12 = 0;
        while (i12 < 10) {
            Canvas canvas3 = canvas2;
            int i13 = height;
            b(i13, width, paint, canvas3, i12, 1.0f, i12 < i11 ? iA : context.getColor(f.f91882d));
            i12++;
            height = i13;
            canvas2 = canvas3;
        }
        Canvas canvas4 = canvas2;
        int i14 = height;
        if (i11 < 10) {
            b(i14, width, paint, canvas4, i11, (batteryLevel % 10) / 10.0f, iA);
        }
    }

    private static final void b(int i11, int i12, Paint paint, Canvas canvas2, float f11, float f12, int i13) {
        Path path = new Path();
        float f13 = i11;
        float f14 = 0.65f * f13;
        float f15 = (i12 - f14) / 15.0f;
        float f16 = (3.0f * f15) / 5.0f;
        float f17 = f11 * (f15 + f16);
        float f18 = f13 - (f12 * f13);
        float f19 = f12 * f14;
        path.moveTo(f17, f13);
        path.lineTo(f17 + f19, f18);
        float f21 = f17 + f16;
        path.lineTo(f19 + f21, f18);
        path.lineTo(f21, f13);
        path.close();
        paint.setColor(i13);
        paint.setStyle(Paint.Style.FILL);
        canvas2.drawPath(path, paint);
    }

    @SuppressLint({"InflateParams"})
    public final Bitmap c(Context context, xc0.a vehicle) {
        o charge_state;
        Integer battery_level;
        u0 vehicle_config;
        s.k(context, "context");
        s.k(vehicle, "vehicle");
        u5 vehicle_data = vehicle.getVehicle_data();
        u0.d car_type = (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        Canvas canvas2 = canvas;
        int iIntValue = 0;
        canvas2.drawColor(0, PorterDuff.Mode.MULTIPLY);
        if (e.k0(car_type != null ? car_type.getCarTypeCybertruck() : null)) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(g.f91887e);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(g.f91886d);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelOffset, dimensionPixelOffset2, Bitmap.Config.ARGB_8888);
            s.j(bitmapCreateBitmap, "createBitmap(...)");
            u5 vehicle_data2 = vehicle.getVehicle_data();
            if (vehicle_data2 != null && (charge_state = vehicle_data2.getCharge_state()) != null && (battery_level = charge_state.getBattery_level()) != null) {
                iIntValue = battery_level.intValue();
            }
            canvas2.setBitmap(bitmapCreateBitmap);
            a(canvas2, iIntValue, vehicle, context, dimensionPixelOffset, dimensionPixelOffset2);
            return bitmapCreateBitmap;
        }
        View viewInflate = LayoutInflater.from(context).inflate(j.f91949a, (ViewGroup) null);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(g.f91885c);
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(g.f91883a);
        View viewFindViewById = viewInflate.findViewById(i.f91918b);
        s.j(viewFindViewById, "findViewById(...)");
        b0.h(viewFindViewById, vehicle);
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset3, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset4, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelOffset3, dimensionPixelOffset4, Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap2, "createBitmap(...)");
        canvas2.setBitmap(bitmapCreateBitmap2);
        viewInflate.draw(canvas2);
        return bitmapCreateBitmap2;
    }
}
