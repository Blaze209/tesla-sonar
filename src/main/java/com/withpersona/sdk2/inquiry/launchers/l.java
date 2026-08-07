package com.withpersona.sdk2.inquiry.launchers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.contract.ActivityResultContract;
import androidx.p002activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.p002activity.result.contract.ActivityResultContracts$TakePicture;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001f\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/g0;", "Landroid/net/Uri;", "", "h", "()Lcom/withpersona/sdk2/inquiry/launchers/g0;", "", "", "", DateTokenConverter.CONVERTER_KEY, "Lh/f;", "f", "launchers_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {
    public static final g0<String[], List<Uri>> d() {
        return new g0<>(new ActivityResultContract<String[], List<Uri>>() { // from class: androidx.activity.result.contract.ActivityResultContracts$OpenMultipleDocuments
            @Override // androidx.p002activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, String[] input) {
                s.k(context, "context");
                s.k(input, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
                s.j(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            }

            @Override // androidx.p002activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ActivityResultContract.a<List<Uri>> getSynchronousResult(Context context, String[] input) {
                s.k(context, "context");
                s.k(input, "input");
                return null;
            }

            @Override // androidx.p002activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final List<Uri> parseResult(int resultCode, Intent intent) {
                List<Uri> listA;
                if (resultCode != -1) {
                    intent = null;
                }
                return (intent == null || (listA = ActivityResultContracts$GetMultipleContents.INSTANCE.a(intent)) == null) ? v.m() : listA;
            }
        }, new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.j
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                l.e((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List uriList) {
        p013kotlin.jvm.internal.s.k(uriList, "uriList");
        new u().a(uriList);
    }

    public static final g0<h.f, List<Uri>> f() {
        return new g0<>(new ActivityResultContracts$PickMultipleVisualMedia(0, 1, null), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.i
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                l.g((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(List uriList) {
        p013kotlin.jvm.internal.s.k(uriList, "uriList");
        new u().a(uriList);
    }

    public static final g0<Uri, Boolean> h() {
        return new g0<>(new ActivityResultContracts$TakePicture(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.k
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                l.i(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z11) {
        new z().a(z11);
    }
}
