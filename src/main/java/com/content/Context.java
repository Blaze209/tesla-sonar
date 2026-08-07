package com.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.y;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.ByteArrayOutputStream;
import l5.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.reactnativestripesdk.y0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "drawableId", "Landroid/graphics/Bitmap;", "c", "(Landroid/content/Context;I)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "drawable", "b", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "str", "Lcom/stripe/android/paymentsheet/y$d$b;", "f", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$d$b;", "Lcom/stripe/android/paymentsheet/y$o;", "g", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$o;", "Lcom/stripe/android/paymentsheet/y$d$a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$d$a;", "type", "Lcom/stripe/android/paymentsheet/y$n$e;", "h", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$n$e;", "Lcom/stripe/android/paymentsheet/y$n$a;", "e", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$n$a;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Context {
    public static final String a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        return Base64.encodeToString(byteArray, 0);
    }

    public static final Bitmap b(Drawable drawable) {
        s.k(drawable, "drawable");
        Drawable drawableMutate = a.r(drawable).mutate();
        s.j(drawableMutate, "mutate(...)");
        if (drawableMutate.getIntrinsicWidth() <= 0 || drawableMutate.getIntrinsicHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.eraseColor(-1);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final Bitmap c(android.content.Context context, int i11) {
        s.h(context);
        Drawable drawableB = j.a.b(context, i11);
        if (drawableB == null) {
            return null;
        }
        return b(drawableB);
    }

    public static final y.BillingDetailsCollectionConfiguration.a d(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3154575) {
                if (iHashCode != 104712844) {
                    if (iHashCode == 1673671211 && str.equals("automatic")) {
                        return y.BillingDetailsCollectionConfiguration.a.Automatic;
                    }
                } else if (str.equals(PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
                    return y.BillingDetailsCollectionConfiguration.a.Never;
                }
            } else if (str.equals("full")) {
                return y.BillingDetailsCollectionConfiguration.a.Full;
            }
        }
        return y.BillingDetailsCollectionConfiguration.a.Automatic;
    }

    public static final y.n.a e(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1997548570) {
                if (iHashCode != -617328117) {
                    if (iHashCode == 155078449 && str.equals("AutomaticAsync")) {
                        return y.n.a.AutomaticAsync;
                    }
                } else if (str.equals("Automatic")) {
                    return y.n.a.Automatic;
                }
            } else if (str.equals("Manual")) {
                return y.n.a.Manual;
            }
        }
        return y.n.a.Automatic;
    }

    public static final y.BillingDetailsCollectionConfiguration.b f(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1414557169) {
                if (iHashCode != 104712844) {
                    if (iHashCode == 1673671211 && str.equals("automatic")) {
                        return y.BillingDetailsCollectionConfiguration.b.Automatic;
                    }
                } else if (str.equals(PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
                    return y.BillingDetailsCollectionConfiguration.b.Never;
                }
            } else if (str.equals(PermissionsResponse.SCOPE_ALWAYS)) {
                return y.BillingDetailsCollectionConfiguration.b.Always;
            }
        }
        return y.BillingDetailsCollectionConfiguration.b.Automatic;
    }

    public static final y.o g(String str) {
        if (s.f(str, "Horizontal")) {
            return y.o.Horizontal;
        }
        return s.f(str, "Vertical") ? y.o.Vertical : y.o.Automatic;
    }

    public static final y.n.e h(String str) {
        if (s.f(str, "OffSession")) {
            return y.n.e.OffSession;
        }
        if (s.f(str, "OnSession")) {
            return y.n.e.OnSession;
        }
        return null;
    }
}
