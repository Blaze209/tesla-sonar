package di;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayInputStream;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public class m {
    public static Drawable a(String str, Context context) {
        return b(str, context, 480);
    }

    public static Drawable b(String str, Context context, int i11) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(nh.a.d(str));
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (i11 <= 0) {
                    i11 = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                }
                options.inDensity = i11;
                options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(byteArrayInputStream, null, options));
                c(byteArrayInputStream);
                return bitmapDrawable;
            } catch (Throwable unused) {
                c(byteArrayInputStream);
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayInputStream = null;
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
