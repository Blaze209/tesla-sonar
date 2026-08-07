package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.canhub.cropper.o, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0005\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u001f\u001a\u00020\t\u0012\b\b\u0003\u0010 \u001a\u00020\u0014\u0012\b\b\u0003\u0010!\u001a\u00020\t\u0012\b\b\u0003\u0010\"\u001a\u00020\t\u0012\b\b\u0003\u0010#\u001a\u00020\t\u0012\b\b\u0003\u0010$\u001a\u00020\u0014\u0012\b\b\u0003\u0010%\u001a\u00020\u0014\u0012\b\b\u0003\u0010&\u001a\u00020\t\u0012\b\b\u0003\u0010'\u001a\u00020\u0014\u0012\b\b\u0003\u0010(\u001a\u00020\u0014\u0012\b\b\u0003\u0010)\u001a\u00020\u0014\u0012\b\b\u0003\u0010*\u001a\u00020\u0014\u0012\b\b\u0003\u0010+\u001a\u00020\u0014\u0012\b\b\u0003\u0010,\u001a\u00020\u0014\u0012\b\b\u0003\u0010-\u001a\u00020\u0014\u0012\b\b\u0003\u0010.\u001a\u00020\u0014\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0003\u00101\u001a\u00020\u0014\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u00107\u001a\u00020\u0014\u0012\b\b\u0003\u00108\u001a\u00020\u0014\u0012\b\b\u0003\u00109\u001a\u00020\u0014\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010<\u001a\u00020\u0002\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010?\u001a\u00020\u0014\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010C\u001a\u00020\u0014\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010E\u001a\u00020\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010/\u0012\b\b\u0003\u0010G\u001a\u00020\u0014\u0012\b\b\u0002\u0010H\u001a\u00020\u0002\u0012\b\b\u0002\u0010I\u001a\u00020\u0002\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010L\u0012\b\b\u0003\u0010N\u001a\u00020\t\u0012\b\b\u0003\u0010O\u001a\u00020\u0014\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010J\u0012\b\b\u0003\u0010Q\u001a\u00020\u0014\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bV\u0010WJ\u001d\u0010\\\u001a\u00020[2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020\u0014¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020\u0014¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020JHÖ\u0001¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bb\u0010_J\u001a\u0010e\u001a\u00020\u00022\b\u0010d\u001a\u0004\u0018\u00010cHÖ\u0003¢\u0006\u0004\be\u0010fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bv\u0010hR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bw\u0010hR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bx\u0010hR\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b{\u0010hR\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b|\u0010hR\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b}\u0010hR\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b~\u0010hR\u0016\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010zR\u0017\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010oR\u0017\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010hR\u0017\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010zR\u0017\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010zR\u0017\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010oR\u0017\u0010 \u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010zR\u0017\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010oR\u0017\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010oR\u0017\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010oR\u0017\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010zR\u0017\u0010%\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010zR\u0017\u0010&\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010oR\u0017\u0010'\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010zR\u0016\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bo\u0010zR\u0017\u0010)\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010zR\u0017\u0010*\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010zR\u0016\u0010+\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bz\u0010zR\u0017\u0010,\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010zR\u0017\u0010-\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010zR\u0017\u0010.\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010zR\u0018\u00100\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u00101\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010zR\u001a\u00102\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u00106\u001a\u0002058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u00107\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010zR\u0017\u00108\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010zR\u0017\u00109\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010zR\u0018\u0010;\u001a\u00020:8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010hR\u001a\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010?\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010zR\u0017\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010hR\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bh\u0010hR\u0017\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010hR\u0017\u0010C\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010zR\u0017\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010hR\u0017\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010hR\u001a\u0010F\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u0093\u0001R\u0017\u0010G\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010zR\u0017\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010hR\u0017\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010hR\u001a\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R \u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010N\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010oR\u0017\u0010O\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010zR\u001a\u0010P\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b³\u0001\u0010®\u0001R\u0017\u0010Q\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010zR\u001a\u0010R\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0096\u0001R\u001a\u0010S\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010\u0096\u0001R\u001a\u0010T\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b·\u0001\u0010\u0096\u0001R\u001a\u0010U\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0096\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/canhub/cropper/o;", "Landroid/os/Parcelable;", "", "imageSourceIncludeGallery", "imageSourceIncludeCamera", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "", "cropCornerRadius", "snapRadius", "touchRadius", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "Lcom/canhub/cropper/CropImageView$l;", "scaleType", "showCropOverlay", "showCropLabel", "showProgressBar", "", "progressBarColor", "autoZoomEnabled", "multiTouchEnabled", "centerMoveEnabled", "canChangeCropWindow", "maxZoom", "initialCropWindowPaddingRatio", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "borderLineThickness", "borderLineColor", "borderCornerThickness", "borderCornerOffset", "borderCornerLength", "borderCornerColor", "circleCornerFillColorHexValue", "guidelinesThickness", "guidelinesColor", "backgroundColor", "minCropWindowWidth", "minCropWindowHeight", "minCropResultWidth", "minCropResultHeight", "maxCropResultWidth", "maxCropResultHeight", "", "activityTitle", "activityMenuIconColor", "activityMenuTextColor", "Landroid/net/Uri;", "customOutputUri", "Landroid/graphics/Bitmap$CompressFormat;", "outputCompressFormat", "outputCompressQuality", "outputRequestWidth", "outputRequestHeight", "Lcom/canhub/cropper/CropImageView$k;", "outputRequestSizeOptions", "noOutputImage", "Landroid/graphics/Rect;", "initialCropWindowRectangle", "initialRotation", "allowRotation", "allowFlipping", "allowCounterRotation", "rotationDegrees", "flipHorizontally", "flipVertically", "cropMenuCropButtonTitle", "cropMenuCropButtonIcon", "skipEditing", "showIntentChooser", "", "intentChooserTitle", "", "intentChooserPriorityList", "cropperLabelTextSize", "cropperLabelTextColor", "cropperLabelText", "activityBackgroundColor", "toolbarColor", "toolbarTitleColor", "toolbarBackButtonColor", "toolbarTintColor", "<init>", "(ZZLcom/canhub/cropper/CropImageView$d;Lcom/canhub/cropper/CropImageView$b;FFFLcom/canhub/cropper/CropImageView$e;Lcom/canhub/cropper/CropImageView$l;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$k;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "c", "Lcom/canhub/cropper/CropImageView$d;", DateTokenConverter.CONVERTER_KEY, "Lcom/canhub/cropper/CropImageView$b;", "e", Gender.FEMALE, "f", "g", "h", "Lcom/canhub/cropper/CropImageView$e;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/canhub/cropper/CropImageView$l;", "j", "k", "l", "m", "I", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "G", "H", "J", "K", "L", Gender.MALE, "Ljava/lang/CharSequence;", Gender.NONE, Gender.OTHER, "Ljava/lang/Integer;", "P", "Landroid/net/Uri;", "Q", "Landroid/graphics/Bitmap$CompressFormat;", "R", "S", "T", Gender.UNKNOWN, "Lcom/canhub/cropper/CropImageView$k;", "V", "W", "Landroid/graphics/Rect;", "X", "Y", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "Ljava/lang/String;", "j0", "Ljava/util/List;", "k0", "l0", "m0", "n0", "o0", "p0", "q0", "r0", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    public float borderCornerLength;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    public int borderCornerColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    public int circleCornerFillColorHexValue;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    public float guidelinesThickness;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    public int guidelinesColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    public int backgroundColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    public int minCropWindowWidth;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    public int minCropWindowHeight;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
    public int minCropResultWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
    public int minCropResultHeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
    public int maxCropResultWidth;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
    public int maxCropResultHeight;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
    public CharSequence activityTitle;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
    public int activityMenuIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
    public Integer activityMenuTextColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
    public Uri customOutputUri;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
    public Bitmap.CompressFormat outputCompressFormat;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
    public int outputCompressQuality;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata and from toString */
    public int outputRequestWidth;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata and from toString */
    public int outputRequestHeight;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata and from toString */
    public CropImageView.k outputRequestSizeOptions;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata and from toString */
    public boolean noOutputImage;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata and from toString */
    public Rect initialCropWindowRectangle;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata and from toString */
    public int initialRotation;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata and from toString */
    public boolean allowRotation;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata and from toString */
    public boolean allowFlipping;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean imageSourceIncludeGallery;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean allowCounterRotation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean imageSourceIncludeCamera;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    public int rotationDegrees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public CropImageView.d cropShape;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean flipHorizontally;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public CropImageView.b cornerShape;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean flipVertically;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public float cropCornerRadius;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    public CharSequence cropMenuCropButtonTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public float snapRadius;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    public int cropMenuCropButtonIcon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public float touchRadius;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean skipEditing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public CropImageView.e guidelines;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showIntentChooser;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public CropImageView.l scaleType;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
    public String intentChooserTitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showCropOverlay;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
    public List<String> intentChooserPriorityList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showCropLabel;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
    public float cropperLabelTextSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showProgressBar;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
    public int cropperLabelTextColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public int progressBarColor;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
    public String cropperLabelText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean autoZoomEnabled;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
    public int activityBackgroundColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean multiTouchEnabled;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata and from toString */
    public Integer toolbarColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean centerMoveEnabled;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata and from toString */
    public Integer toolbarTitleColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean canChangeCropWindow;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata and from toString */
    public Integer toolbarBackButtonColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    public int maxZoom;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata and from toString */
    public Integer toolbarTintColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    public float initialCropWindowPaddingRatio;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean fixAspectRatio;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    public int aspectRatioX;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    public int aspectRatioY;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    public float borderLineThickness;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    public int borderLineColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    public float borderCornerThickness;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    public float borderCornerOffset;

    /* JADX INFO: renamed from: com.canhub.cropper.o$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CropImageOptions> {
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
              (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x029d: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.canhub.cropper.CropImageOptions createFromParcel(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
              (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x029d: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r74v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CropImageOptions[] newArray(int i11) {
            return new CropImageOptions[i11];
        }
    }

    public CropImageOptions() {
        this(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) other;
        return this.imageSourceIncludeGallery == cropImageOptions.imageSourceIncludeGallery && this.imageSourceIncludeCamera == cropImageOptions.imageSourceIncludeCamera && this.cropShape == cropImageOptions.cropShape && this.cornerShape == cropImageOptions.cornerShape && Float.compare(this.cropCornerRadius, cropImageOptions.cropCornerRadius) == 0 && Float.compare(this.snapRadius, cropImageOptions.snapRadius) == 0 && Float.compare(this.touchRadius, cropImageOptions.touchRadius) == 0 && this.guidelines == cropImageOptions.guidelines && this.scaleType == cropImageOptions.scaleType && this.showCropOverlay == cropImageOptions.showCropOverlay && this.showCropLabel == cropImageOptions.showCropLabel && this.showProgressBar == cropImageOptions.showProgressBar && this.progressBarColor == cropImageOptions.progressBarColor && this.autoZoomEnabled == cropImageOptions.autoZoomEnabled && this.multiTouchEnabled == cropImageOptions.multiTouchEnabled && this.centerMoveEnabled == cropImageOptions.centerMoveEnabled && this.canChangeCropWindow == cropImageOptions.canChangeCropWindow && this.maxZoom == cropImageOptions.maxZoom && Float.compare(this.initialCropWindowPaddingRatio, cropImageOptions.initialCropWindowPaddingRatio) == 0 && this.fixAspectRatio == cropImageOptions.fixAspectRatio && this.aspectRatioX == cropImageOptions.aspectRatioX && this.aspectRatioY == cropImageOptions.aspectRatioY && Float.compare(this.borderLineThickness, cropImageOptions.borderLineThickness) == 0 && this.borderLineColor == cropImageOptions.borderLineColor && Float.compare(this.borderCornerThickness, cropImageOptions.borderCornerThickness) == 0 && Float.compare(this.borderCornerOffset, cropImageOptions.borderCornerOffset) == 0 && Float.compare(this.borderCornerLength, cropImageOptions.borderCornerLength) == 0 && this.borderCornerColor == cropImageOptions.borderCornerColor && this.circleCornerFillColorHexValue == cropImageOptions.circleCornerFillColorHexValue && Float.compare(this.guidelinesThickness, cropImageOptions.guidelinesThickness) == 0 && this.guidelinesColor == cropImageOptions.guidelinesColor && this.backgroundColor == cropImageOptions.backgroundColor && this.minCropWindowWidth == cropImageOptions.minCropWindowWidth && this.minCropWindowHeight == cropImageOptions.minCropWindowHeight && this.minCropResultWidth == cropImageOptions.minCropResultWidth && this.minCropResultHeight == cropImageOptions.minCropResultHeight && this.maxCropResultWidth == cropImageOptions.maxCropResultWidth && this.maxCropResultHeight == cropImageOptions.maxCropResultHeight && p013kotlin.jvm.internal.s.f(this.activityTitle, cropImageOptions.activityTitle) && this.activityMenuIconColor == cropImageOptions.activityMenuIconColor && p013kotlin.jvm.internal.s.f(this.activityMenuTextColor, cropImageOptions.activityMenuTextColor) && p013kotlin.jvm.internal.s.f(this.customOutputUri, cropImageOptions.customOutputUri) && this.outputCompressFormat == cropImageOptions.outputCompressFormat && this.outputCompressQuality == cropImageOptions.outputCompressQuality && this.outputRequestWidth == cropImageOptions.outputRequestWidth && this.outputRequestHeight == cropImageOptions.outputRequestHeight && this.outputRequestSizeOptions == cropImageOptions.outputRequestSizeOptions && this.noOutputImage == cropImageOptions.noOutputImage && p013kotlin.jvm.internal.s.f(this.initialCropWindowRectangle, cropImageOptions.initialCropWindowRectangle) && this.initialRotation == cropImageOptions.initialRotation && this.allowRotation == cropImageOptions.allowRotation && this.allowFlipping == cropImageOptions.allowFlipping && this.allowCounterRotation == cropImageOptions.allowCounterRotation && this.rotationDegrees == cropImageOptions.rotationDegrees && this.flipHorizontally == cropImageOptions.flipHorizontally && this.flipVertically == cropImageOptions.flipVertically && p013kotlin.jvm.internal.s.f(this.cropMenuCropButtonTitle, cropImageOptions.cropMenuCropButtonTitle) && this.cropMenuCropButtonIcon == cropImageOptions.cropMenuCropButtonIcon && this.skipEditing == cropImageOptions.skipEditing && this.showIntentChooser == cropImageOptions.showIntentChooser && p013kotlin.jvm.internal.s.f(this.intentChooserTitle, cropImageOptions.intentChooserTitle) && p013kotlin.jvm.internal.s.f(this.intentChooserPriorityList, cropImageOptions.intentChooserPriorityList) && Float.compare(this.cropperLabelTextSize, cropImageOptions.cropperLabelTextSize) == 0 && this.cropperLabelTextColor == cropImageOptions.cropperLabelTextColor && p013kotlin.jvm.internal.s.f(this.cropperLabelText, cropImageOptions.cropperLabelText) && this.activityBackgroundColor == cropImageOptions.activityBackgroundColor && p013kotlin.jvm.internal.s.f(this.toolbarColor, cropImageOptions.toolbarColor) && p013kotlin.jvm.internal.s.f(this.toolbarTitleColor, cropImageOptions.toolbarTitleColor) && p013kotlin.jvm.internal.s.f(this.toolbarBackButtonColor, cropImageOptions.toolbarBackButtonColor) && p013kotlin.jvm.internal.s.f(this.toolbarTintColor, cropImageOptions.toolbarTintColor);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.imageSourceIncludeGallery) * 31) + Boolean.hashCode(this.imageSourceIncludeCamera)) * 31) + this.cropShape.hashCode()) * 31) + this.cornerShape.hashCode()) * 31) + Float.hashCode(this.cropCornerRadius)) * 31) + Float.hashCode(this.snapRadius)) * 31) + Float.hashCode(this.touchRadius)) * 31) + this.guidelines.hashCode()) * 31) + this.scaleType.hashCode()) * 31) + Boolean.hashCode(this.showCropOverlay)) * 31) + Boolean.hashCode(this.showCropLabel)) * 31) + Boolean.hashCode(this.showProgressBar)) * 31) + Integer.hashCode(this.progressBarColor)) * 31) + Boolean.hashCode(this.autoZoomEnabled)) * 31) + Boolean.hashCode(this.multiTouchEnabled)) * 31) + Boolean.hashCode(this.centerMoveEnabled)) * 31) + Boolean.hashCode(this.canChangeCropWindow)) * 31) + Integer.hashCode(this.maxZoom)) * 31) + Float.hashCode(this.initialCropWindowPaddingRatio)) * 31) + Boolean.hashCode(this.fixAspectRatio)) * 31) + Integer.hashCode(this.aspectRatioX)) * 31) + Integer.hashCode(this.aspectRatioY)) * 31) + Float.hashCode(this.borderLineThickness)) * 31) + Integer.hashCode(this.borderLineColor)) * 31) + Float.hashCode(this.borderCornerThickness)) * 31) + Float.hashCode(this.borderCornerOffset)) * 31) + Float.hashCode(this.borderCornerLength)) * 31) + Integer.hashCode(this.borderCornerColor)) * 31) + Integer.hashCode(this.circleCornerFillColorHexValue)) * 31) + Float.hashCode(this.guidelinesThickness)) * 31) + Integer.hashCode(this.guidelinesColor)) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.minCropWindowWidth)) * 31) + Integer.hashCode(this.minCropWindowHeight)) * 31) + Integer.hashCode(this.minCropResultWidth)) * 31) + Integer.hashCode(this.minCropResultHeight)) * 31) + Integer.hashCode(this.maxCropResultWidth)) * 31) + Integer.hashCode(this.maxCropResultHeight)) * 31) + this.activityTitle.hashCode()) * 31) + Integer.hashCode(this.activityMenuIconColor)) * 31;
        Integer num = this.activityMenuTextColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.customOutputUri;
        int iHashCode3 = (((((((((((((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + this.outputCompressFormat.hashCode()) * 31) + Integer.hashCode(this.outputCompressQuality)) * 31) + Integer.hashCode(this.outputRequestWidth)) * 31) + Integer.hashCode(this.outputRequestHeight)) * 31) + this.outputRequestSizeOptions.hashCode()) * 31) + Boolean.hashCode(this.noOutputImage)) * 31;
        Rect rect = this.initialCropWindowRectangle;
        int iHashCode4 = (((((((((((((((iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31) + Integer.hashCode(this.initialRotation)) * 31) + Boolean.hashCode(this.allowRotation)) * 31) + Boolean.hashCode(this.allowFlipping)) * 31) + Boolean.hashCode(this.allowCounterRotation)) * 31) + Integer.hashCode(this.rotationDegrees)) * 31) + Boolean.hashCode(this.flipHorizontally)) * 31) + Boolean.hashCode(this.flipVertically)) * 31;
        CharSequence charSequence = this.cropMenuCropButtonTitle;
        int iHashCode5 = (((((((iHashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.cropMenuCropButtonIcon)) * 31) + Boolean.hashCode(this.skipEditing)) * 31) + Boolean.hashCode(this.showIntentChooser)) * 31;
        String str = this.intentChooserTitle;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.intentChooserPriorityList;
        int iHashCode7 = (((((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.cropperLabelTextSize)) * 31) + Integer.hashCode(this.cropperLabelTextColor)) * 31;
        String str2 = this.cropperLabelText;
        int iHashCode8 = (((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.activityBackgroundColor)) * 31;
        Integer num2 = this.toolbarColor;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.toolbarTitleColor;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.toolbarBackButtonColor;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.toolbarTintColor;
        return iHashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        boolean z11 = this.imageSourceIncludeGallery;
        boolean z12 = this.imageSourceIncludeCamera;
        CropImageView.d dVar = this.cropShape;
        CropImageView.b bVar = this.cornerShape;
        float f11 = this.cropCornerRadius;
        float f12 = this.snapRadius;
        float f13 = this.touchRadius;
        CropImageView.e eVar = this.guidelines;
        CropImageView.l lVar = this.scaleType;
        boolean z13 = this.showCropOverlay;
        boolean z14 = this.showCropLabel;
        boolean z15 = this.showProgressBar;
        int i11 = this.progressBarColor;
        boolean z16 = this.autoZoomEnabled;
        boolean z17 = this.multiTouchEnabled;
        boolean z18 = this.centerMoveEnabled;
        boolean z19 = this.canChangeCropWindow;
        int i12 = this.maxZoom;
        float f14 = this.initialCropWindowPaddingRatio;
        boolean z21 = this.fixAspectRatio;
        int i13 = this.aspectRatioX;
        int i14 = this.aspectRatioY;
        float f15 = this.borderLineThickness;
        int i15 = this.borderLineColor;
        float f16 = this.borderCornerThickness;
        float f17 = this.borderCornerOffset;
        float f18 = this.borderCornerLength;
        int i16 = this.borderCornerColor;
        int i17 = this.circleCornerFillColorHexValue;
        float f19 = this.guidelinesThickness;
        int i18 = this.guidelinesColor;
        int i19 = this.backgroundColor;
        int i21 = this.minCropWindowWidth;
        int i22 = this.minCropWindowHeight;
        int i23 = this.minCropResultWidth;
        int i24 = this.minCropResultHeight;
        int i25 = this.maxCropResultWidth;
        int i26 = this.maxCropResultHeight;
        CharSequence charSequence = this.activityTitle;
        int i27 = this.activityMenuIconColor;
        Integer num = this.activityMenuTextColor;
        Uri uri = this.customOutputUri;
        Bitmap.CompressFormat compressFormat = this.outputCompressFormat;
        int i28 = this.outputCompressQuality;
        int i29 = this.outputRequestWidth;
        int i31 = this.outputRequestHeight;
        CropImageView.k kVar = this.outputRequestSizeOptions;
        boolean z22 = this.noOutputImage;
        Rect rect = this.initialCropWindowRectangle;
        int i32 = this.initialRotation;
        boolean z23 = this.allowRotation;
        boolean z24 = this.allowFlipping;
        boolean z25 = this.allowCounterRotation;
        int i33 = this.rotationDegrees;
        boolean z26 = this.flipHorizontally;
        boolean z27 = this.flipVertically;
        CharSequence charSequence2 = this.cropMenuCropButtonTitle;
        return "CropImageOptions(imageSourceIncludeGallery=" + z11 + ", imageSourceIncludeCamera=" + z12 + ", cropShape=" + dVar + ", cornerShape=" + bVar + ", cropCornerRadius=" + f11 + ", snapRadius=" + f12 + ", touchRadius=" + f13 + ", guidelines=" + eVar + ", scaleType=" + lVar + ", showCropOverlay=" + z13 + ", showCropLabel=" + z14 + ", showProgressBar=" + z15 + ", progressBarColor=" + i11 + ", autoZoomEnabled=" + z16 + ", multiTouchEnabled=" + z17 + ", centerMoveEnabled=" + z18 + ", canChangeCropWindow=" + z19 + ", maxZoom=" + i12 + ", initialCropWindowPaddingRatio=" + f14 + ", fixAspectRatio=" + z21 + ", aspectRatioX=" + i13 + ", aspectRatioY=" + i14 + ", borderLineThickness=" + f15 + ", borderLineColor=" + i15 + ", borderCornerThickness=" + f16 + ", borderCornerOffset=" + f17 + ", borderCornerLength=" + f18 + ", borderCornerColor=" + i16 + ", circleCornerFillColorHexValue=" + i17 + ", guidelinesThickness=" + f19 + ", guidelinesColor=" + i18 + ", backgroundColor=" + i19 + ", minCropWindowWidth=" + i21 + ", minCropWindowHeight=" + i22 + ", minCropResultWidth=" + i23 + ", minCropResultHeight=" + i24 + ", maxCropResultWidth=" + i25 + ", maxCropResultHeight=" + i26 + ", activityTitle=" + ((Object) charSequence) + ", activityMenuIconColor=" + i27 + ", activityMenuTextColor=" + num + ", customOutputUri=" + uri + ", outputCompressFormat=" + compressFormat + ", outputCompressQuality=" + i28 + ", outputRequestWidth=" + i29 + ", outputRequestHeight=" + i31 + ", outputRequestSizeOptions=" + kVar + ", noOutputImage=" + z22 + ", initialCropWindowRectangle=" + rect + ", initialRotation=" + i32 + ", allowRotation=" + z23 + ", allowFlipping=" + z24 + ", allowCounterRotation=" + z25 + ", rotationDegrees=" + i33 + ", flipHorizontally=" + z26 + ", flipVertically=" + z27 + ", cropMenuCropButtonTitle=" + ((Object) charSequence2) + ", cropMenuCropButtonIcon=" + this.cropMenuCropButtonIcon + ", skipEditing=" + this.skipEditing + ", showIntentChooser=" + this.showIntentChooser + ", intentChooserTitle=" + this.intentChooserTitle + ", intentChooserPriorityList=" + this.intentChooserPriorityList + ", cropperLabelTextSize=" + this.cropperLabelTextSize + ", cropperLabelTextColor=" + this.cropperLabelTextColor + ", cropperLabelText=" + this.cropperLabelText + ", activityBackgroundColor=" + this.activityBackgroundColor + ", toolbarColor=" + this.toolbarColor + ", toolbarTitleColor=" + this.toolbarTitleColor + ", toolbarBackButtonColor=" + this.toolbarBackButtonColor + ", toolbarTintColor=" + this.toolbarTintColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeInt(this.imageSourceIncludeGallery ? 1 : 0);
        dest.writeInt(this.imageSourceIncludeCamera ? 1 : 0);
        dest.writeString(this.cropShape.name());
        dest.writeString(this.cornerShape.name());
        dest.writeFloat(this.cropCornerRadius);
        dest.writeFloat(this.snapRadius);
        dest.writeFloat(this.touchRadius);
        dest.writeString(this.guidelines.name());
        dest.writeString(this.scaleType.name());
        dest.writeInt(this.showCropOverlay ? 1 : 0);
        dest.writeInt(this.showCropLabel ? 1 : 0);
        dest.writeInt(this.showProgressBar ? 1 : 0);
        dest.writeInt(this.progressBarColor);
        dest.writeInt(this.autoZoomEnabled ? 1 : 0);
        dest.writeInt(this.multiTouchEnabled ? 1 : 0);
        dest.writeInt(this.centerMoveEnabled ? 1 : 0);
        dest.writeInt(this.canChangeCropWindow ? 1 : 0);
        dest.writeInt(this.maxZoom);
        dest.writeFloat(this.initialCropWindowPaddingRatio);
        dest.writeInt(this.fixAspectRatio ? 1 : 0);
        dest.writeInt(this.aspectRatioX);
        dest.writeInt(this.aspectRatioY);
        dest.writeFloat(this.borderLineThickness);
        dest.writeInt(this.borderLineColor);
        dest.writeFloat(this.borderCornerThickness);
        dest.writeFloat(this.borderCornerOffset);
        dest.writeFloat(this.borderCornerLength);
        dest.writeInt(this.borderCornerColor);
        dest.writeInt(this.circleCornerFillColorHexValue);
        dest.writeFloat(this.guidelinesThickness);
        dest.writeInt(this.guidelinesColor);
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.minCropWindowWidth);
        dest.writeInt(this.minCropWindowHeight);
        dest.writeInt(this.minCropResultWidth);
        dest.writeInt(this.minCropResultHeight);
        dest.writeInt(this.maxCropResultWidth);
        dest.writeInt(this.maxCropResultHeight);
        TextUtils.writeToParcel(this.activityTitle, dest, flags);
        dest.writeInt(this.activityMenuIconColor);
        Integer num = this.activityMenuTextColor;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.customOutputUri, flags);
        dest.writeString(this.outputCompressFormat.name());
        dest.writeInt(this.outputCompressQuality);
        dest.writeInt(this.outputRequestWidth);
        dest.writeInt(this.outputRequestHeight);
        dest.writeString(this.outputRequestSizeOptions.name());
        dest.writeInt(this.noOutputImage ? 1 : 0);
        dest.writeParcelable(this.initialCropWindowRectangle, flags);
        dest.writeInt(this.initialRotation);
        dest.writeInt(this.allowRotation ? 1 : 0);
        dest.writeInt(this.allowFlipping ? 1 : 0);
        dest.writeInt(this.allowCounterRotation ? 1 : 0);
        dest.writeInt(this.rotationDegrees);
        dest.writeInt(this.flipHorizontally ? 1 : 0);
        dest.writeInt(this.flipVertically ? 1 : 0);
        TextUtils.writeToParcel(this.cropMenuCropButtonTitle, dest, flags);
        dest.writeInt(this.cropMenuCropButtonIcon);
        dest.writeInt(this.skipEditing ? 1 : 0);
        dest.writeInt(this.showIntentChooser ? 1 : 0);
        dest.writeString(this.intentChooserTitle);
        dest.writeStringList(this.intentChooserPriorityList);
        dest.writeFloat(this.cropperLabelTextSize);
        dest.writeInt(this.cropperLabelTextColor);
        dest.writeString(this.cropperLabelText);
        dest.writeInt(this.activityBackgroundColor);
        Integer num2 = this.toolbarColor;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.toolbarTitleColor;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.toolbarBackButtonColor;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.toolbarTintColor;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
    }

    public CropImageOptions(boolean z11, boolean z12, CropImageView.d cropShape, CropImageView.b cornerShape, float f11, float f12, float f13, CropImageView.e guidelines, CropImageView.l scaleType, boolean z13, boolean z14, boolean z15, int i11, boolean z16, boolean z17, boolean z18, boolean z19, int i12, float f14, boolean z21, int i13, int i14, float f15, int i15, float f16, float f17, float f18, int i16, int i17, float f19, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, CharSequence activityTitle, int i27, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i28, int i29, int i31, CropImageView.k outputRequestSizeOptions, boolean z22, Rect rect, int i32, boolean z23, boolean z24, boolean z25, int i33, boolean z26, boolean z27, CharSequence charSequence, int i34, boolean z28, boolean z29, String str, List<String> list, float f21, int i35, String str2, int i36, Integer num2, Integer num3, Integer num4, Integer num5) {
        p013kotlin.jvm.internal.s.k(cropShape, "cropShape");
        p013kotlin.jvm.internal.s.k(cornerShape, "cornerShape");
        p013kotlin.jvm.internal.s.k(guidelines, "guidelines");
        p013kotlin.jvm.internal.s.k(scaleType, "scaleType");
        p013kotlin.jvm.internal.s.k(activityTitle, "activityTitle");
        p013kotlin.jvm.internal.s.k(outputCompressFormat, "outputCompressFormat");
        p013kotlin.jvm.internal.s.k(outputRequestSizeOptions, "outputRequestSizeOptions");
        this.imageSourceIncludeGallery = z11;
        this.imageSourceIncludeCamera = z12;
        this.cropShape = cropShape;
        this.cornerShape = cornerShape;
        this.cropCornerRadius = f11;
        this.snapRadius = f12;
        this.touchRadius = f13;
        this.guidelines = guidelines;
        this.scaleType = scaleType;
        this.showCropOverlay = z13;
        this.showCropLabel = z14;
        this.showProgressBar = z15;
        this.progressBarColor = i11;
        this.autoZoomEnabled = z16;
        this.multiTouchEnabled = z17;
        this.centerMoveEnabled = z18;
        this.canChangeCropWindow = z19;
        this.maxZoom = i12;
        this.initialCropWindowPaddingRatio = f14;
        this.fixAspectRatio = z21;
        this.aspectRatioX = i13;
        this.aspectRatioY = i14;
        this.borderLineThickness = f15;
        this.borderLineColor = i15;
        this.borderCornerThickness = f16;
        this.borderCornerOffset = f17;
        this.borderCornerLength = f18;
        this.borderCornerColor = i16;
        this.circleCornerFillColorHexValue = i17;
        this.guidelinesThickness = f19;
        this.guidelinesColor = i18;
        this.backgroundColor = i19;
        this.minCropWindowWidth = i21;
        this.minCropWindowHeight = i22;
        this.minCropResultWidth = i23;
        this.minCropResultHeight = i24;
        this.maxCropResultWidth = i25;
        this.maxCropResultHeight = i26;
        this.activityTitle = activityTitle;
        this.activityMenuIconColor = i27;
        this.activityMenuTextColor = num;
        this.customOutputUri = uri;
        this.outputCompressFormat = outputCompressFormat;
        this.outputCompressQuality = i28;
        this.outputRequestWidth = i29;
        this.outputRequestHeight = i31;
        this.outputRequestSizeOptions = outputRequestSizeOptions;
        this.noOutputImage = z22;
        this.initialCropWindowRectangle = rect;
        this.initialRotation = i32;
        this.allowRotation = z23;
        this.allowFlipping = z24;
        this.allowCounterRotation = z25;
        this.rotationDegrees = i33;
        this.flipHorizontally = z26;
        this.flipVertically = z27;
        this.cropMenuCropButtonTitle = charSequence;
        this.cropMenuCropButtonIcon = i34;
        this.skipEditing = z28;
        this.showIntentChooser = z29;
        this.intentChooserTitle = str;
        this.intentChooserPriorityList = list;
        this.cropperLabelTextSize = f21;
        this.cropperLabelTextColor = i35;
        this.cropperLabelText = str2;
        this.activityBackgroundColor = i36;
        this.toolbarColor = num2;
        this.toolbarTitleColor = num3;
        this.toolbarBackButtonColor = num4;
        this.toolbarTintColor = num5;
        if (i12 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (f13 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if (f14 < BitmapDescriptorFactory.HUE_RED || f14 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (i13 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (i14 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (f15 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (f16 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (f19 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (i22 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if (i23 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if (i24 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (i25 < i23) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (i26 < i24) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (i29 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (i31 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if (i33 < 0 || i33 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropImageOptions(boolean z11, boolean z12, CropImageView.d dVar, CropImageView.b bVar, float f11, float f12, float f13, CropImageView.e eVar, CropImageView.l lVar, boolean z13, boolean z14, boolean z15, int i11, boolean z16, boolean z17, boolean z18, boolean z19, int i12, float f14, boolean z21, int i13, int i14, float f15, int i15, float f16, float f17, float f18, int i16, int i17, float f19, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, CharSequence charSequence, int i27, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i28, int i29, int i31, CropImageView.k kVar, boolean z22, Rect rect, int i32, boolean z23, boolean z24, boolean z25, int i33, boolean z26, boolean z27, CharSequence charSequence2, int i34, boolean z28, boolean z29, String str, List list, float f21, int i35, String str2, int i36, Integer num2, Integer num3, Integer num4, Integer num5, int i37, int i38, int i39, DefaultConstructorMarker defaultConstructorMarker) {
        int i41;
        float fApplyDimension;
        int i42;
        int iApplyDimension;
        boolean z31 = (i37 & 1) != 0 ? true : z11;
        boolean z32 = (i37 & 2) != 0 ? true : z12;
        CropImageView.d dVar2 = (i37 & 4) != 0 ? CropImageView.d.RECTANGLE : dVar;
        CropImageView.b bVar2 = (i37 & 8) != 0 ? CropImageView.b.RECTANGLE : bVar;
        float fApplyDimension2 = (i37 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f11;
        float fApplyDimension3 = (i37 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f12;
        float fApplyDimension4 = (i37 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f13;
        CropImageView.e eVar2 = (i37 & 128) != 0 ? CropImageView.e.ON : eVar;
        CropImageView.l lVar2 = (i37 & 256) != 0 ? CropImageView.l.FIT_CENTER : lVar;
        boolean z33 = (i37 & 512) != 0 ? true : z13;
        boolean z34 = (i37 & 1024) != 0 ? false : z14;
        boolean z35 = (i37 & 2048) != 0 ? true : z15;
        int iRgb = (i37 & 4096) != 0 ? Color.rgb(153, 51, 153) : i11;
        boolean z36 = (i37 & PKIFailureInfo.certRevoked) != 0 ? true : z16;
        boolean z37 = z31;
        boolean z38 = (i37 & 16384) != 0 ? false : z17;
        boolean z39 = (i37 & 32768) != 0 ? true : z18;
        boolean z41 = (i37 & 65536) != 0 ? true : z19;
        int i43 = (i37 & 131072) != 0 ? 4 : i12;
        float f22 = (i37 & 262144) != 0 ? BitmapDescriptorFactory.HUE_RED : f14;
        boolean z42 = (i37 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z21;
        int i44 = (i37 & PKIFailureInfo.badCertTemplate) != 0 ? 1 : i13;
        int i45 = (i37 & PKIFailureInfo.badSenderNonce) != 0 ? 1 : i14;
        float fApplyDimension5 = (i37 & 4194304) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f15;
        int iArgb = (i37 & 8388608) != 0 ? Color.argb(170, 255, 255, 255) : i15;
        if ((i37 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            i41 = 1;
            fApplyDimension = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i41 = 1;
            fApplyDimension = f16;
        }
        float fApplyDimension6 = (i37 & 33554432) != 0 ? TypedValue.applyDimension(i41, 5.0f, Resources.getSystem().getDisplayMetrics()) : f17;
        float fApplyDimension7 = (i37 & 67108864) != 0 ? TypedValue.applyDimension(i41, 14.0f, Resources.getSystem().getDisplayMetrics()) : f18;
        int i46 = (i37 & 134217728) != 0 ? -1 : i16;
        int i47 = (i37 & 268435456) != 0 ? -1 : i17;
        float fApplyDimension8 = (i37 & PKIFailureInfo.duplicateCertReq) != 0 ? TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics()) : f19;
        int iArgb2 = (i37 & 1073741824) != 0 ? Color.argb(170, 255, 255, 255) : i18;
        int iArgb3 = (i37 & Integer.MIN_VALUE) != 0 ? Color.argb(119, 0, 0, 0) : i19;
        if ((i38 & 1) != 0) {
            i42 = 1;
            iApplyDimension = (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i42 = 1;
            iApplyDimension = i21;
        }
        this(z37, z32, dVar2, bVar2, fApplyDimension2, fApplyDimension3, fApplyDimension4, eVar2, lVar2, z33, z34, z35, iRgb, z36, z38, z39, z41, i43, f22, z42, i44, i45, fApplyDimension5, iArgb, fApplyDimension, fApplyDimension6, fApplyDimension7, i46, i47, fApplyDimension8, iArgb2, iArgb3, iApplyDimension, (i38 & 2) != 0 ? (int) TypedValue.applyDimension(i42, 42.0f, Resources.getSystem().getDisplayMetrics()) : i22, (i38 & 4) != 0 ? 40 : i23, (i38 & 8) != 0 ? 40 : i24, (i38 & 16) != 0 ? 99999 : i25, (i38 & 32) != 0 ? 99999 : i26, (i38 & 64) != 0 ? "" : charSequence, (i38 & 128) != 0 ? 0 : i27, (i38 & 256) != 0 ? null : num, (i38 & 512) != 0 ? null : uri, (i38 & 1024) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat, (i38 & 2048) != 0 ? 90 : i28, (i38 & 4096) != 0 ? 0 : i29, (i38 & PKIFailureInfo.certRevoked) != 0 ? 0 : i31, (i38 & 16384) != 0 ? CropImageView.k.NONE : kVar, (i38 & 32768) != 0 ? false : z22, (i38 & 65536) != 0 ? null : rect, (i38 & 131072) != 0 ? -1 : i32, (i38 & 262144) != 0 ? true : z23, (i38 & PKIFailureInfo.signerNotTrusted) != 0 ? true : z24, (i38 & PKIFailureInfo.badCertTemplate) != 0 ? false : z25, (i38 & PKIFailureInfo.badSenderNonce) != 0 ? 90 : i33, (i38 & 4194304) != 0 ? false : z26, (i38 & 8388608) != 0 ? false : z27, (i38 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : charSequence2, (i38 & 33554432) != 0 ? 0 : i34, (i38 & 67108864) != 0 ? false : z28, (i38 & 134217728) != 0 ? false : z29, (i38 & 268435456) != 0 ? null : str, (i38 & PKIFailureInfo.duplicateCertReq) != 0 ? p013kotlin.collections.v.m() : list, (i38 & 1073741824) != 0 ? TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics()) : f21, (i38 & Integer.MIN_VALUE) != 0 ? -1 : i35, (i39 & 1) != 0 ? "" : str2, (i39 & 2) != 0 ? -1 : i36, (i39 & 4) != 0 ? null : num2, (i39 & 8) != 0 ? null : num3, (i39 & 16) != 0 ? null : num4, (i39 & 32) != 0 ? null : num5);
    }
}
