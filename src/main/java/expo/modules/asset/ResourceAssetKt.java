package expo.modules.asset;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.errors.InvalidArgumentException;
import java.io.InputStream;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"ANDROID_EMBEDDED_URL_BASE_RESOURCE", "", "openAssetResourceStream", "Ljava/io/InputStream;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "assetName", "openAndroidResStream", "resourceFilePath", "findResourceId", "", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "findResourceIdForAndroidResPath", "expo-asset_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ResourceAssetKt {
    public static final String ANDROID_EMBEDDED_URL_BASE_RESOURCE = "file:///android_res/";

    @SuppressLint({"DiscouragedApi"})
    private static final Integer findResourceId(Context context, String str) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        Integer numValueOf = Integer.valueOf(resources.getIdentifier(str, "raw", packageName));
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        Integer numValueOf2 = Integer.valueOf(resources.getIdentifier(str, "drawable", packageName));
        if (numValueOf2.intValue() != 0) {
            return numValueOf2;
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    private static final Integer findResourceIdForAndroidResPath(Context context, String str) {
        if (!t.b0(str, ANDROID_EMBEDDED_URL_BASE_RESOURCE, false, 2, null)) {
            throw new InvalidArgumentException("Invalid resource file path: " + str);
        }
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() < 3) {
            throw new InvalidArgumentException("Invalid resource file path: " + str);
        }
        String str2 = pathSegments.get(1);
        s.j(str2, "get(...)");
        String strY1 = t.y1(str2, CoreConstants.DASH_CHAR, null, 2, null);
        String str3 = pathSegments.get(2);
        s.h(str3);
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier(t.A1(str3, CoreConstants.DOT, str3), strY1, context.getPackageName()));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    public static final InputStream openAndroidResStream(Context context, String resourceFilePath) {
        s.k(context, "context");
        s.k(resourceFilePath, "resourceFilePath");
        Integer numFindResourceIdForAndroidResPath = findResourceIdForAndroidResPath(context, resourceFilePath);
        if (numFindResourceIdForAndroidResPath == null) {
            throw new Resources.NotFoundException(resourceFilePath);
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(numFindResourceIdForAndroidResPath.intValue());
        s.j(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    public static final InputStream openAssetResourceStream(Context context, String assetName) {
        s.k(context, "context");
        s.k(assetName, "assetName");
        Integer numFindResourceId = findResourceId(context, assetName);
        if (numFindResourceId == null) {
            throw new Resources.NotFoundException(assetName);
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(numFindResourceId.intValue());
        s.j(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }
}
