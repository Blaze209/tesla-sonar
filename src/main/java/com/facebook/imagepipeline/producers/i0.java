package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.contacts.Columns;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/imagepipeline/producers/i0;", "Lcom/facebook/imagepipeline/producers/l0;", "Ljava/util/concurrent/Executor;", "executor", "Lsk/h;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Lsk/h;Landroid/content/ContentResolver;)V", "Landroid/net/Uri;", "uri", "Lum/k;", "g", "(Landroid/net/Uri;)Lum/k;", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/request/a;)Lum/k;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/ContentResolver;", "a", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f21838e = {Columns.ID, "_data"};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, sk.h pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(pooledByteBufferFactory, "pooledByteBufferFactory");
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    private final um.k g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.contentResolver.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            um.k kVarE = e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            p013kotlin.jvm.internal.s.j(kVarE, "getEncodedImage(...)");
            parcelFileDescriptorOpenFileDescriptor.close();
            return kVarE;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected um.k d(com.facebook.imagepipeline.request.a imageRequest) throws IOException {
        um.k kVarG;
        InputStream inputStreamCreateInputStream;
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        Uri uriV = imageRequest.v();
        p013kotlin.jvm.internal.s.j(uriV, "getSourceUri(...)");
        if (!xk.e.k(uriV)) {
            if (xk.e.j(uriV) && (kVarG = g(uriV)) != null) {
                return kVarG;
            }
            InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(uriV);
            if (inputStreamOpenInputStream != null) {
                return e(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string = uriV.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        if (p013kotlin.text.t.L(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.contentResolver.openInputStream(uriV);
        } else {
            String string2 = uriV.toString();
            p013kotlin.jvm.internal.s.j(string2, "toString(...)");
            if (p013kotlin.text.t.L(string2, "/display_photo", false, 2, null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.contentResolver.openAssetFileDescriptor(uriV, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + uriV);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.contentResolver, uriV);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + uriV);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return e(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
