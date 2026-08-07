package com.canhub.cropper;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.p002activity.b0;
import androidx.p002activity.d0;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContract;
import androidx.p002activity.result.contract.ActivityResultContracts$TakePicture;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@jn0.e
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002XYB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b&\u0010'J/\u0010.\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000e2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0005J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020(H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J1\u0010=\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u000e2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,2\u0006\u0010<\u001a\u000208H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\u0005J1\u0010A\u001a\u00020@2\b\u0010*\u001a\u0004\u0018\u00010\u000e2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,2\u0006\u0010<\u001a\u000208H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010C\u001a\u0002082\u0006\u0010D\u001a\u000208H\u0016¢\u0006\u0004\bE\u0010FJ'\u0010G\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010C\u001a\u0002082\u0006\u0010D\u001a\u000208H\u0016¢\u0006\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u00105\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000e0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010U¨\u0006Z"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/c;", "Lcom/canhub/cropper/CropImageView$j;", "Lcom/canhub/cropper/CropImageView$f;", "<init>", "()V", "Ljn0/h0;", "setCustomizations", "showIntentChooser", "Lcom/canhub/cropper/CropImageActivity$b;", "source", "openSource", "(Lcom/canhub/cropper/CropImageActivity$b;)V", "openCamera", "Landroid/net/Uri;", "getTmpFileUri", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "showImageSourceDialog", "(Lwn0/l;)V", "onStart", "onStop", "outState", "onSaveInstanceState", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "resultUri", "onPickImageResult", "(Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView;", "view", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "onSetImageUriComplete", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/CropImageView$c;", "result", "onCropImageComplete", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$c;)V", "cropImage", "cropImageView", "setCropImageView", "(Lcom/canhub/cropper/CropImageView;)V", "", "degrees", "rotateImage", "(I)V", "sampleSize", "setResult", "(Landroid/net/Uri;Ljava/lang/Exception;I)V", "setResultCancel", "Landroid/content/Intent;", "getResultIntent", "(Landroid/net/Uri;Ljava/lang/Exception;I)Landroid/content/Intent;", "itemId", "color", "updateMenuItemIconColor", "(Landroid/view/Menu;II)V", "updateMenuItemTextColor", "cropImageUri", "Landroid/net/Uri;", "Lcom/canhub/cropper/o;", "cropImageOptions", "Lcom/canhub/cropper/o;", "Lcom/canhub/cropper/CropImageView;", "Lzj/a;", "binding", "Lzj/a;", "latestTmpUri", "Landroidx/activity/result/ActivityResultLauncher;", "", "pickImageGallery", "Landroidx/activity/result/ActivityResultLauncher;", "takePicture", "Companion", "b", "a", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CropImageActivity extends androidx.appcompat.app.c implements CropImageView.j, CropImageView.f {

    @Deprecated
    public static final String BUNDLE_KEY_TMP_URI = "bundle_key_tmp_uri";
    private static final a Companion = new a(null);
    private zj.a binding;
    private CropImageOptions cropImageOptions;
    private Uri cropImageUri;
    private CropImageView cropImageView;
    private Uri latestTmpUri;
    private final ActivityResultLauncher<String> pickImageGallery = registerForActivityResult(new ActivityResultContract<String, Uri>() { // from class: androidx.activity.result.contract.ActivityResultContracts$GetContent
        @Override // androidx.p002activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, String input) {
            s.k(context, "context");
            s.k(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            s.j(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ActivityResultContract.a<Uri> getSynchronousResult(Context context, String input) {
            s.k(context, "context");
            s.k(input, "input");
            return null;
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Uri parseResult(int resultCode, Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }, new ActivityResultCallback() { // from class: com.canhub.cropper.f
        @Override // androidx.p002activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.pickImageGallery$lambda$0(this.f21053a, (Uri) obj);
        }
    });
    private final ActivityResultLauncher<Uri> takePicture = registerForActivityResult(new ActivityResultContracts$TakePicture(), new ActivityResultCallback() { // from class: com.canhub.cropper.g
        @Override // androidx.p002activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.takePicture$lambda$1(this.f21054a, ((Boolean) obj).booleanValue());
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropImageActivity$a;", "", "<init>", "()V", "", "BUNDLE_KEY_TMP_URI", "Ljava/lang/String;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA", "GALLERY", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        CAMERA,
        GALLERY;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20914a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.GALLERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20914a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l<b, h0> {
        d(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        public final void a(b p11) throws IOException {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((CropImageActivity) this.receiver).openSource(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b bVar) throws IOException {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/canhub/cropper/CropImageActivity$e", "Lcom/canhub/cropper/n$b;", "Landroid/net/Uri;", "uri", "Ljn0/h0;", "a", "(Landroid/net/Uri;)V", "b", "()V", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements n.b {
        e() {
        }

        @Override // com.canhub.cropper.n.b
        public void a(Uri uri) {
            CropImageActivity.this.onPickImageResult(uri);
        }

        @Override // com.canhub.cropper.n.b
        public void b() {
            CropImageActivity.this.setResultCancel();
        }
    }

    private final Uri getTmpFileUri() throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        fileCreateTempFile.createNewFile();
        fileCreateTempFile.deleteOnExit();
        p013kotlin.jvm.internal.s.h(fileCreateTempFile);
        return ak.a.b(this, fileCreateTempFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 onCreate$lambda$2(CropImageActivity this$0, b0 addCallback) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(addCallback, "$this$addCallback");
        this$0.setResultCancel();
        return h0.f84049a;
    }

    private final void openCamera() throws IOException {
        Uri tmpFileUri = getTmpFileUri();
        this.latestTmpUri = tmpFileUri;
        this.takePicture.b(tmpFileUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openSource(b source) throws IOException {
        int i11 = c.f20914a[source.ordinal()];
        if (i11 == 1) {
            openCamera();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.pickImageGallery.b("image/*");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickImageGallery$lambda$0(CropImageActivity this$0, Uri uri) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.onPickImageResult(uri);
    }

    private final void setCustomizations() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions = null;
        }
        int i11 = cropImageOptions.activityBackgroundColor;
        zj.a aVar = this.binding;
        if (aVar == null) {
            p013kotlin.jvm.internal.s.B("binding");
            aVar = null;
        }
        aVar.getRoot().setBackgroundColor(i11);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions3 = null;
            }
            CharSequence charSequence = cropImageOptions3.activityTitle;
            if (charSequence.length() == 0) {
                charSequence = "";
            }
            setTitle(charSequence);
            supportActionBar.u(true);
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions4 = null;
            }
            Integer num = cropImageOptions4.toolbarColor;
            if (num != null) {
                supportActionBar.r(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions5 = null;
            }
            Integer num2 = cropImageOptions5.toolbarTitleColor;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions6;
            }
            Integer num3 = cropImageOptions2.toolbarBackButtonColor;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                try {
                    Drawable drawable = androidx.core.content.b.getDrawable(this, r.f21141a);
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP));
                    }
                    supportActionBar.y(drawable);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showImageSourceDialog$lambda$16(CropImageActivity this$0, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (i11 == 4 && keyEvent.getAction() == 1) {
            this$0.setResultCancel();
            this$0.finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showImageSourceDialog$lambda$17(wn0.l openSource, DialogInterface dialogInterface, int i11) {
        p013kotlin.jvm.internal.s.k(openSource, "$openSource");
        openSource.invoke(i11 == 0 ? b.CAMERA : b.GALLERY);
    }

    private final void showIntentChooser() {
        n nVar = new n(this, new e());
        CropImageOptions cropImageOptions = this.cropImageOptions;
        if (cropImageOptions == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions = null;
        }
        String str = cropImageOptions.intentChooserTitle;
        if (str != null) {
            if (p013kotlin.text.t.y0(str)) {
                str = null;
            }
            if (str != null) {
                nVar.g(str);
            }
        }
        List<String> list = cropImageOptions.intentChooserPriorityList;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                nVar.h(list);
            }
        }
        nVar.i(cropImageOptions.imageSourceIncludeCamera, cropImageOptions.imageSourceIncludeGallery, cropImageOptions.imageSourceIncludeCamera ? getTmpFileUri() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takePicture$lambda$1(CropImageActivity this$0, boolean z11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (z11) {
            this$0.onPickImageResult(this$0.latestTmpUri);
        } else {
            this$0.onPickImageResult(null);
        }
    }

    public void cropImage() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions = null;
        }
        if (cropImageOptions.noOutputImage) {
            setResult(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions3 = null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions3.outputCompressFormat;
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions4 = null;
            }
            int i11 = cropImageOptions4.outputCompressQuality;
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions5 = null;
            }
            int i12 = cropImageOptions5.outputRequestWidth;
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions6 = null;
            }
            int i13 = cropImageOptions6.outputRequestHeight;
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions7 = null;
            }
            CropImageView.k kVar = cropImageOptions7.outputRequestSizeOptions;
            CropImageOptions cropImageOptions8 = this.cropImageOptions;
            if (cropImageOptions8 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions8;
            }
            cropImageView.d(compressFormat, i11, i12, i13, kVar, cropImageOptions2.customOutputUri);
        }
    }

    public Intent getResultIntent(Uri uri, Exception error, int sampleSize) {
        CropImageView cropImageView = this.cropImageView;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.cropImageView;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.cropImageView;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.cropImageView;
        int mDegreesRotated = cropImageView4 != null ? cropImageView4.getMDegreesRotated() : 0;
        CropImageView cropImageView5 = this.cropImageView;
        com.canhub.cropper.d dVar = new com.canhub.cropper.d(imageUri, uri, error, cropPoints, cropRect, mDegreesRotated, cropImageView5 != null ? cropImageView5.getWholeImageRect() : null, sampleSize);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", dVar);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws IOException {
        Uri uri;
        CropImageOptions cropImageOptions;
        CropImageOptions cropImageOptions2;
        CropImageOptions cropImageOptions3;
        super.onCreate(savedInstanceState);
        zj.a aVarC = zj.a.c(getLayoutInflater());
        this.binding = aVarC;
        CropImageOptions cropImageOptions4 = null;
        if (aVarC == null) {
            p013kotlin.jvm.internal.s.B("binding");
            aVarC = null;
        }
        setContentView(aVarC.getRoot());
        zj.a aVar = this.binding;
        if (aVar == null) {
            p013kotlin.jvm.internal.s.B("binding");
            aVar = null;
        }
        CropImageView cropImageView = aVar.f128394b;
        p013kotlin.jvm.internal.s.j(cropImageView, "cropImageView");
        setCropImageView(cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        if (bundleExtra != null) {
            Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
            if (!(parcelable instanceof Uri)) {
                parcelable = null;
            }
            uri = (Uri) parcelable;
        } else {
            uri = null;
        }
        this.cropImageUri = uri;
        if (bundleExtra != null) {
            Parcelable parcelable2 = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            if (!(parcelable2 instanceof CropImageOptions)) {
                parcelable2 = null;
            }
            cropImageOptions = (CropImageOptions) parcelable2;
            if (cropImageOptions == null) {
                cropImageOptions = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
            }
        } else {
            cropImageOptions = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        }
        this.cropImageOptions = cropImageOptions;
        if (savedInstanceState == null) {
            Uri uri2 = this.cropImageUri;
            if (uri2 == null || p013kotlin.jvm.internal.s.f(uri2, Uri.EMPTY)) {
                CropImageOptions cropImageOptions5 = this.cropImageOptions;
                if (cropImageOptions5 == null) {
                    p013kotlin.jvm.internal.s.B("cropImageOptions");
                    cropImageOptions5 = null;
                }
                if (cropImageOptions5.showIntentChooser) {
                    showIntentChooser();
                } else {
                    CropImageOptions cropImageOptions6 = this.cropImageOptions;
                    if (cropImageOptions6 == null) {
                        p013kotlin.jvm.internal.s.B("cropImageOptions");
                        cropImageOptions6 = null;
                    }
                    if (cropImageOptions6.imageSourceIncludeGallery) {
                        CropImageOptions cropImageOptions7 = this.cropImageOptions;
                        if (cropImageOptions7 == null) {
                            p013kotlin.jvm.internal.s.B("cropImageOptions");
                            cropImageOptions7 = null;
                        }
                        if (cropImageOptions7.imageSourceIncludeCamera) {
                            showImageSourceDialog(new d(this));
                        } else {
                            cropImageOptions2 = this.cropImageOptions;
                            if (cropImageOptions2 == null) {
                                p013kotlin.jvm.internal.s.B("cropImageOptions");
                                cropImageOptions2 = null;
                            }
                            if (cropImageOptions2.imageSourceIncludeGallery) {
                                this.pickImageGallery.b("image/*");
                            } else {
                                cropImageOptions3 = this.cropImageOptions;
                                if (cropImageOptions3 == null) {
                                    p013kotlin.jvm.internal.s.B("cropImageOptions");
                                } else {
                                    cropImageOptions4 = cropImageOptions3;
                                }
                                if (cropImageOptions4.imageSourceIncludeCamera) {
                                    openCamera();
                                } else {
                                    finish();
                                }
                            }
                        }
                    } else {
                        cropImageOptions2 = this.cropImageOptions;
                        if (cropImageOptions2 == null) {
                            p013kotlin.jvm.internal.s.B("cropImageOptions");
                            cropImageOptions2 = null;
                        }
                        if (cropImageOptions2.imageSourceIncludeGallery) {
                            this.pickImageGallery.b("image/*");
                        } else {
                            cropImageOptions3 = this.cropImageOptions;
                            if (cropImageOptions3 == null) {
                                p013kotlin.jvm.internal.s.B("cropImageOptions");
                            } else {
                                cropImageOptions4 = cropImageOptions3;
                            }
                            if (cropImageOptions4.imageSourceIncludeCamera) {
                                openCamera();
                            } else {
                                finish();
                            }
                        }
                    }
                }
            } else {
                CropImageView cropImageView2 = this.cropImageView;
                if (cropImageView2 != null) {
                    cropImageView2.setImageUriAsync(this.cropImageUri);
                }
            }
        } else {
            String string = savedInstanceState.getString(BUNDLE_KEY_TMP_URI);
            this.latestTmpUri = string != null ? Uri.parse(string) : null;
        }
        setCustomizations();
        d0.b(getOnBackPressedDispatcher(), null, false, new wn0.l() { // from class: com.canhub.cropper.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return CropImageActivity.onCreate$lambda$2(this.f21057a, (b0) obj);
            }
        }, 3, null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        p013kotlin.jvm.internal.s.k(menu, "menu");
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions = null;
        }
        if (cropImageOptions.skipEditing) {
            return true;
        }
        getMenuInflater().inflate(u.f21153a, menu);
        CropImageOptions cropImageOptions3 = this.cropImageOptions;
        if (cropImageOptions3 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions3 = null;
        }
        if (cropImageOptions3.allowRotation) {
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions4 = null;
            }
            if (cropImageOptions4.allowCounterRotation) {
                menu.findItem(s.f21149h).setVisible(true);
            }
        } else {
            menu.removeItem(s.f21149h);
            menu.removeItem(s.f21150i);
        }
        CropImageOptions cropImageOptions5 = this.cropImageOptions;
        if (cropImageOptions5 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions5 = null;
        }
        if (!cropImageOptions5.allowFlipping) {
            menu.removeItem(s.f21146e);
        }
        CropImageOptions cropImageOptions6 = this.cropImageOptions;
        if (cropImageOptions6 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions6 = null;
        }
        if (cropImageOptions6.cropMenuCropButtonTitle != null) {
            MenuItem menuItemFindItem = menu.findItem(s.f21145d);
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions7 = null;
            }
            menuItemFindItem.setTitle(cropImageOptions7.cropMenuCropButtonTitle);
        }
        try {
            CropImageOptions cropImageOptions8 = this.cropImageOptions;
            if (cropImageOptions8 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions8 = null;
            }
            if (cropImageOptions8.cropMenuCropButtonIcon != 0) {
                CropImageOptions cropImageOptions9 = this.cropImageOptions;
                if (cropImageOptions9 == null) {
                    p013kotlin.jvm.internal.s.B("cropImageOptions");
                    cropImageOptions9 = null;
                }
                drawable = androidx.core.content.b.getDrawable(this, cropImageOptions9.cropMenuCropButtonIcon);
                try {
                    menu.findItem(s.f21145d).setIcon(drawable);
                } catch (Exception e11) {
                    e = e11;
                    Log.w("AIC", "Failed to read menu crop drawable", e);
                }
            } else {
                drawable = null;
            }
        } catch (Exception e12) {
            e = e12;
            drawable = null;
        }
        CropImageOptions cropImageOptions10 = this.cropImageOptions;
        if (cropImageOptions10 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions10 = null;
        }
        if (cropImageOptions10.activityMenuIconColor != 0) {
            int i11 = s.f21149h;
            CropImageOptions cropImageOptions11 = this.cropImageOptions;
            if (cropImageOptions11 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions11 = null;
            }
            updateMenuItemIconColor(menu, i11, cropImageOptions11.activityMenuIconColor);
            int i12 = s.f21150i;
            CropImageOptions cropImageOptions12 = this.cropImageOptions;
            if (cropImageOptions12 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions12 = null;
            }
            updateMenuItemIconColor(menu, i12, cropImageOptions12.activityMenuIconColor);
            int i13 = s.f21146e;
            CropImageOptions cropImageOptions13 = this.cropImageOptions;
            if (cropImageOptions13 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions13 = null;
            }
            updateMenuItemIconColor(menu, i13, cropImageOptions13.activityMenuIconColor);
            if (drawable != null) {
                int i14 = s.f21145d;
                CropImageOptions cropImageOptions14 = this.cropImageOptions;
                if (cropImageOptions14 == null) {
                    p013kotlin.jvm.internal.s.B("cropImageOptions");
                    cropImageOptions14 = null;
                }
                updateMenuItemIconColor(menu, i14, cropImageOptions14.activityMenuIconColor);
            }
        }
        CropImageOptions cropImageOptions15 = this.cropImageOptions;
        if (cropImageOptions15 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
        } else {
            cropImageOptions2 = cropImageOptions15;
        }
        Integer num = cropImageOptions2.activityMenuTextColor;
        if (num != null) {
            int iIntValue = num.intValue();
            Iterator it = p013kotlin.collections.v.p(Integer.valueOf(s.f21149h), Integer.valueOf(s.f21150i), Integer.valueOf(s.f21146e), Integer.valueOf(s.f21147f), Integer.valueOf(s.f21148g), Integer.valueOf(s.f21145d)).iterator();
            while (it.hasNext()) {
                updateMenuItemTextColor(menu, ((Number) it.next()).intValue(), iIntValue);
            }
        }
        return true;
    }

    @Override // com.canhub.cropper.CropImageView.f
    public void onCropImageComplete(CropImageView view, CropImageView.c result) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(result, "result");
        setResult(result.getUriContent(), result.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String(), result.getSampleSize());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        int itemId = item.getItemId();
        if (itemId == s.f21145d) {
            cropImage();
            return true;
        }
        CropImageOptions cropImageOptions = null;
        if (itemId == s.f21149h) {
            CropImageOptions cropImageOptions2 = this.cropImageOptions;
            if (cropImageOptions2 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions2;
            }
            rotateImage(-cropImageOptions.rotationDegrees);
            return true;
        }
        if (itemId == s.f21150i) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions3;
            }
            rotateImage(cropImageOptions.rotationDegrees);
            return true;
        }
        if (itemId == s.f21147f) {
            CropImageView cropImageView = this.cropImageView;
            if (cropImageView != null) {
                cropImageView.e();
            }
            return true;
        }
        if (itemId == s.f21148g) {
            CropImageView cropImageView2 = this.cropImageView;
            if (cropImageView2 != null) {
                cropImageView2.f();
            }
            return true;
        }
        if (itemId != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        setResultCancel();
        return true;
    }

    protected void onPickImageResult(Uri resultUri) {
        if (resultUri == null) {
            setResultCancel();
            return;
        }
        this.cropImageUri = resultUri;
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(resultUri);
        }
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        p013kotlin.jvm.internal.s.k(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(BUNDLE_KEY_TMP_URI, String.valueOf(this.latestTmpUri));
    }

    @Override // com.canhub.cropper.CropImageView.j
    public void onSetImageUriComplete(CropImageView view, Uri uri, Exception error) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(uri, "uri");
        CropImageOptions cropImageOptions = null;
        if (error != null) {
            setResult(null, error, 1);
            return;
        }
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        if (cropImageOptions2 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.initialCropWindowRectangle != null && (cropImageView2 = this.cropImageView) != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions3 = null;
            }
            cropImageView2.setCropRect(cropImageOptions3.initialCropWindowRectangle);
        }
        CropImageOptions cropImageOptions4 = this.cropImageOptions;
        if (cropImageOptions4 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
            cropImageOptions4 = null;
        }
        if (cropImageOptions4.initialRotation > 0 && (cropImageView = this.cropImageView) != null) {
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                p013kotlin.jvm.internal.s.B("cropImageOptions");
                cropImageOptions5 = null;
            }
            cropImageView.setRotatedDegrees(cropImageOptions5.initialRotation);
        }
        CropImageOptions cropImageOptions6 = this.cropImageOptions;
        if (cropImageOptions6 == null) {
            p013kotlin.jvm.internal.s.B("cropImageOptions");
        } else {
            cropImageOptions = cropImageOptions6;
        }
        if (cropImageOptions.skipEditing) {
            cropImage();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    public void rotateImage(int degrees) {
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.m(degrees);
        }
    }

    public void setCropImageView(CropImageView cropImageView) {
        p013kotlin.jvm.internal.s.k(cropImageView, "cropImageView");
        this.cropImageView = cropImageView;
    }

    public void setResult(Uri uri, Exception error, int sampleSize) {
        setResult(error != null ? EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE : -1, getResultIntent(uri, error, sampleSize));
        finish();
    }

    public void setResultCancel() {
        setResult(0);
        finish();
    }

    public void showImageSourceDialog(final wn0.l<? super b, h0> openSource) {
        p013kotlin.jvm.internal.s.k(openSource, "openSource");
        new androidx.appcompat.app.b.a(this).b(false).j(new DialogInterface.OnKeyListener() { // from class: com.canhub.cropper.h
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                return CropImageActivity.showImageSourceDialog$lambda$16(this.f21055a, dialogInterface, i11, keyEvent);
            }
        }).m(v.f21155b).e(new String[]{getString(v.f21154a), getString(v.f21156c)}, new DialogInterface.OnClickListener() { // from class: com.canhub.cropper.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CropImageActivity.showImageSourceDialog$lambda$17(openSource, dialogInterface, i11);
            }
        }).n();
    }

    public void updateMenuItemIconColor(Menu menu, int itemId, int color) {
        Drawable icon;
        p013kotlin.jvm.internal.s.k(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(itemId);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(k5.a.a(color, k5.b.SRC_ATOP));
            menuItemFindItem.setIcon(icon);
        } catch (Exception e11) {
            Log.w("AIC", "Failed to update menu item color", e11);
        }
    }

    public void updateMenuItemTextColor(Menu menu, int itemId, int color) {
        CharSequence title;
        p013kotlin.jvm.internal.s.k(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(itemId);
        if (menuItemFindItem == null || (title = menuItemFindItem.getTitle()) == null || !(!p013kotlin.text.t.y0(title))) {
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(title);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 33);
            menuItemFindItem.setTitle(spannableString);
        } catch (Exception e11) {
            Log.w("AIC", "Failed to update menu item color", e11);
        }
    }
}
