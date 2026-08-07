package androidx.core.app;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f7577a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f7578b = new Object();

    static Bundle a(o.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.f() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(x xVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", xVar.i());
        bundle.putCharSequence(AnnotatedPrivateKey.LABEL, xVar.h());
        bundle.putCharSequenceArray(InquiryField.ChoicesField.TYPE, xVar.e());
        bundle.putBoolean("allowFreeFormInput", xVar.c());
        bundle.putBundle("extras", xVar.g());
        Set<String> setD = xVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[xVarArr.length];
        for (int i11 = 0; i11 < xVarArr.length; i11++) {
            bundleArr[i11] = b(xVarArr[i11]);
        }
        return bundleArr;
    }
}
