package com.canhub.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.lang.ref.WeakReference;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 ±\u00022\u00020\u00012\u00020\u0002:\rG\u001fhdk}A\u0019!e\u0014\u0082\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0004\b*\u0010&J\u001d\u0010-\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b1\u0010.J\u0015\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0016¢\u0006\u0004\b3\u0010&J\u001d\u00106\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b¢\u0006\u0004\b6\u0010.J\u0015\u00109\u001a\u00020\u00112\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u001b¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJK\u0010G\u001a\u00020\u00112\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020\u000b2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020@2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010M¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010P¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010S¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010V¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bY\u0010ZJ!\u0010Y\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bY\u0010]J\u0017\u0010_\u001a\u00020\u00112\b\u0010^\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b_\u0010`J\u0015\u0010b\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u000b¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u0011¢\u0006\u0004\bd\u0010\u0015J\r\u0010e\u001a\u00020\u0011¢\u0006\u0004\be\u0010\u0015J\u0017\u0010h\u001a\u00020\u00112\u0006\u0010g\u001a\u00020fH\u0000¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u00112\u0006\u0010g\u001a\u00020jH\u0000¢\u0006\u0004\bk\u0010lJ?\u0010m\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u00108\u001a\u00020@2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u000b2\b\u0010F\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bm\u0010nJ\u0011\u0010p\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u00112\u0006\u0010r\u001a\u00020oH\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010w\u001a\u00020\u00112\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020\u000bH\u0014¢\u0006\u0004\bw\u0010.J7\u0010z\u001a\u00020\u00112\u0006\u0010x\u001a\u00020\u00162\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bz\u0010{J2\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020\u000b2\u0006\u0010}\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u000bH\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0082\u0001\u0010&R\u0018\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u008a\u0001R\u0017\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u008a\u0001R\u0017\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u008e\u0001R\u0017\u0010\u0092\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010\u0091\u0001R\u0017\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010\u0091\u0001R\u001b\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b}\u0010\u0095\u0001R\u001a\u0010\u0098\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0097\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bk\u0010\u0099\u0001R\u0018\u0010\u009d\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bb\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0099\u0001R\u0018\u0010 \u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0099\u0001R\u0018\u0010¡\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0099\u0001R\u0019\u0010¤\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010£\u0001R.\u0010¥\u0001\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b%\u0010\u009c\u0001\u0012\u0005\b¨\u0001\u0010\u0015\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010&R\u0019\u0010ª\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u009c\u0001R\u0018\u0010«\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\by\u0010\u009c\u0001R\u001a\u0010¯\u0001\u001a\u00030¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010²\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010\u0099\u0001R\u0019\u0010µ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u009c\u0001R\u0019\u0010·\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010\u009c\u0001R\u0019\u0010¹\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0099\u0001R\u001b\u0010¼\u0001\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001b\u0010¿\u0001\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R-\u0010\u000e\u001a\u0004\u0018\u00010\r2\t\u0010À\u0001\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010\u0099\u0001R\u0019\u0010È\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010±\u0001R\u0019\u0010É\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010±\u0001R\u0019\u0010Ë\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010±\u0001R\u001c\u0010Ï\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0019\u0010Ð\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0099\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010\u009c\u0001R#\u0010×\u0001\u001a\f\u0012\u0005\u0012\u00030Ô\u0001\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R#\u0010Ú\u0001\u001a\f\u0012\u0005\u0012\u00030Ø\u0001\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ö\u0001R)\u0010F\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÛ\u0001\u0010Â\u0001\u001a\u0006\bÜ\u0001\u0010Ä\u0001\"\u0005\bÝ\u0001\u0010`R,\u0010Þ\u0001\u001a\u00030¢\u00012\b\u0010Þ\u0001\u001a\u00030¢\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R0\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00012\n\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R0\u0010ê\u0001\u001a\u0005\u0018\u00010é\u00012\n\u0010ê\u0001\u001a\u0005\u0018\u00010é\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R)\u0010ð\u0001\u001a\u00020\u00162\u0007\u0010ï\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bð\u0001\u0010¦\u0001\"\u0005\bñ\u0001\u0010&R)\u0010ò\u0001\u001a\u00020\u000b2\u0007\u0010ò\u0001\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0005\bõ\u0001\u0010cR(\u0010ø\u0001\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bö\u0001\u0010ô\u0001\"\u0005\b÷\u0001\u0010cR)\u0010ú\u0001\u001a\u00020\u00162\u0007\u0010ù\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bú\u0001\u0010¦\u0001\"\u0005\bû\u0001\u0010&R)\u0010ý\u0001\u001a\u00020\u00162\u0007\u0010ü\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bý\u0001\u0010¦\u0001\"\u0005\bþ\u0001\u0010&R0\u0010\u0080\u0002\u001a\u0005\u0018\u00010ÿ\u00012\n\u0010\u0080\u0002\u001a\u0005\u0018\u00010ÿ\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R!\u0010\u0088\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0085\u00028F¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R)\u0010\u008a\u0002\u001a\u00020\u00162\u0007\u0010\u0089\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008a\u0002\u0010¦\u0001\"\u0005\b\u008b\u0002\u0010&R)\u0010\u008d\u0002\u001a\u00020\u00162\u0007\u0010\u008c\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008d\u0002\u0010¦\u0001\"\u0005\b\u008e\u0002\u0010&R)\u0010\u0090\u0002\u001a\u00020\u00162\u0007\u0010\u008f\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0090\u0002\u0010¦\u0001\"\u0005\b\u0091\u0002\u0010&R,\u0010\u0092\u0002\u001a\u00030¬\u00012\b\u0010\u0092\u0002\u001a\u00030¬\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R)\u0010\u009b\u0002\u001a\u00020\u001b2\u0007\u0010\u0097\u0002\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002\"\u0005\b\u009a\u0002\u0010=R)\u0010\u009c\u0002\u001a\u00020\u000b2\u0007\u0010\u009c\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u009d\u0002\u0010ô\u0001\"\u0005\b\u009e\u0002\u0010cR(\u0010\f\u001a\u00020\u000b2\u0007\u0010\u009f\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b \u0002\u0010ô\u0001\"\u0005\b¡\u0002\u0010cR\u0017\u0010¥\u0002\u001a\u0005\u0018\u00010¢\u00028F¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R0\u0010ª\u0002\u001a\u0005\u0018\u00010¢\u00022\n\u0010¦\u0002\u001a\u0005\u0018\u00010¢\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0002\u0010¤\u0002\"\u0006\b¨\u0002\u0010©\u0002R\u0017\u0010\u00ad\u0002\u001a\u0005\u0018\u00010Ì\u00018F¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u0015\u0010°\u0002\u001a\u00030\u0090\u00018F¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002¨\u0006²\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "imageResource", "Landroid/net/Uri;", "imageUri", "loadSampleSize", "degreesRotated", "Ljn0/h0;", "n", "(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V", "c", "()V", "", "inProgress", "animate", IntegerTokenConverter.CONVERTER_KEY, "(ZZ)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "center", "b", "(FFZZ)V", "j", "o", "p", "clear", "r", "(Z)V", "multiTouchEnabled", "setMultiTouchEnabled", "centerMoveEnabled", "setCenterMoveEnabled", "minCropResultWidth", "minCropResultHeight", "setMinCropResultSize", "(II)V", "maxCropResultWidth", "maxCropResultHeight", "setMaxCropResultSize", "fixAspectRatio", "setFixedAspectRatio", "aspectRatioX", "aspectRatioY", "setAspectRatio", "Lcom/canhub/cropper/o;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/o;)V", "snapRadius", "setSnapRadius", "(F)V", "reqWidth", "reqHeight", "Lcom/canhub/cropper/CropImageView$k;", "g", "(IILcom/canhub/cropper/CropImageView$k;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressFormat", "saveCompressQuality", "customOutputUri", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$k;Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView$h;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/CropImageView$h;)V", "Lcom/canhub/cropper/CropImageView$g;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/CropImageView$g;)V", "Lcom/canhub/cropper/CropImageView$i;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/CropImageView$i;)V", "Lcom/canhub/cropper/CropImageView$j;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/CropImageView$j;)V", "Lcom/canhub/cropper/CropImageView$f;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/CropImageView$f;)V", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Le7/a;", "exif", "(Landroid/graphics/Bitmap;Le7/a;)V", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "degrees", "m", "(I)V", "e", "f", "Lcom/canhub/cropper/b$a;", "result", "l", "(Lcom/canhub/cropper/b$a;)V", "Lcom/canhub/cropper/a$a;", "k", "(Lcom/canhub/cropper/a$a;)V", "q", "(IILcom/canhub/cropper/CropImageView$k;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "t", "onLayout", "(ZIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "a", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Lcom/canhub/cropper/CropOverlayView;", "Lcom/canhub/cropper/CropOverlayView;", "mCropOverlayView", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mImageMatrix", "mImageInverseMatrix", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "mProgressBar", "", "[F", "mImagePoints", "mScaleImagePoints", "Lcom/canhub/cropper/k;", "Lcom/canhub/cropper/k;", "mAnimation", "Landroid/graphics/Bitmap;", "originalBitmap", "I", "mInitialDegreesRotated", "mDegreesRotated", "Z", "mFlipHorizontally", "mFlipVertically", "mLayoutWidth", "mLayoutHeight", "mImageResource", "Lcom/canhub/cropper/CropImageView$l;", "Lcom/canhub/cropper/CropImageView$l;", "mScaleType", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "s", "mShowCropOverlay", "mShowCropLabel", "", "u", "Ljava/lang/String;", "mCropTextLabel", "v", Gender.FEMALE, "mCropLabelTextSize", "mCropLabelTextColor", "x", "mShowProgressBar", "y", "mAutoZoomEnabled", "z", "mMaxZoom", "A", "Lcom/canhub/cropper/CropImageView$j;", "mOnSetImageUriCompleteListener", "B", "Lcom/canhub/cropper/CropImageView$f;", "mOnCropImageCompleteListener", "value", "C", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "D", "loadedSampleSize", "E", "mZoom", "mZoomOffsetX", "G", "mZoomOffsetY", "Landroid/graphics/RectF;", "H", "Landroid/graphics/RectF;", "mRestoreCropWindowRect", "mRestoreDegreesRotated", "J", "mSizeChanged", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/b;", "K", "Ljava/lang/ref/WeakReference;", "bitmapLoadingWorkerJob", "Lcom/canhub/cropper/a;", "L", "bitmapCroppingWorkerJob", Gender.MALE, "getCustomOutputUri", "setCustomOutputUri", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$l;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$l;)V", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$d;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$b;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$b;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$e;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$e;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", "aspectRatio", "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "getCropPoints", "()[F", "cropPoints", Gender.NONE, "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropImageView extends FrameLayout implements CropOverlayView.b {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private j mOnSetImageUriCompleteListener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private f mOnCropImageCompleteListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Uri imageUri;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int loadedSampleSize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float mZoom;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float mZoomOffsetX;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float mZoomOffsetY;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private RectF mRestoreCropWindowRect;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int mRestoreDegreesRotated;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean mSizeChanged;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private WeakReference<com.canhub.cropper.b> bitmapLoadingWorkerJob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private WeakReference<a> bitmapCroppingWorkerJob;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Uri customOutputUri;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageView imageView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CropOverlayView mCropOverlayView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Matrix mImageMatrix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Matrix mImageInverseMatrix;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ProgressBar mProgressBar;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] mImagePoints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] mScaleImagePoints;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private com.canhub.cropper.k mAnimation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Bitmap originalBitmap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int mInitialDegreesRotated;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int mDegreesRotated;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean mFlipHorizontally;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean mFlipVertically;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mLayoutWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int mLayoutHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int mImageResource;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l mScaleType;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isSaveBitmapToInstanceState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean mShowCropOverlay;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean mShowCropLabel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String mCropTextLabel;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float mCropLabelTextSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int mCropLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean mShowProgressBar;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean mAutoZoomEnabled;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int mMaxZoom;

    /* JADX INFO: renamed from: com.canhub.cropper.CropImageView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/canhub/cropper/CropImageView$a;", "", "<init>", "()V", "", "measureSpecMode", "measureSpecSize", "desiredSize", "a", "(III)I", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int measureSpecMode, int measureSpecSize, int desiredSize) {
            if (measureSpecMode != Integer.MIN_VALUE) {
                return measureSpecMode != 1073741824 ? desiredSize : measureSpecSize;
            }
            return Math.min(desiredSize, measureSpecSize);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageView$b;", "", "<init>", "(Ljava/lang/String;I)V", "RECTANGLE", "OVAL", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        RECTANGLE,
        OVAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0015\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u0019\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b#\u0010+¨\u0006-"}, d2 = {"Lcom/canhub/cropper/CropImageView$c;", "", "Landroid/graphics/Bitmap;", "originalBitmap", "Landroid/net/Uri;", "originalUri", "bitmap", "uriContent", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "", "cropPoints", "Landroid/graphics/Rect;", "cropRect", "wholeImageRect", "", "rotation", "sampleSize", "<init>", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V", "a", "Landroid/graphics/Bitmap;", "getOriginalBitmap", "()Landroid/graphics/Bitmap;", "b", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "()Landroid/net/Uri;", "c", "getBitmap", "g", "e", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "f", "[F", "()[F", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "h", IntegerTokenConverter.CONVERTER_KEY, "I", "()I", "j", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap originalBitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Uri originalUri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Uri uriContent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Exception error;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float[] cropPoints;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Rect cropRect;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Rect wholeImageRect;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final int rotation;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final int sampleSize;

        public c(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i11, int i12) {
            p013kotlin.jvm.internal.s.k(cropPoints, "cropPoints");
            this.originalBitmap = bitmap;
            this.originalUri = uri;
            this.bitmap = bitmap2;
            this.uriContent = uri2;
            this.error = exc;
            this.cropPoints = cropPoints;
            this.cropRect = rect;
            this.wholeImageRect = rect2;
            this.rotation = i11;
            this.sampleSize = i12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float[] getCropPoints() {
            return this.cropPoints;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Rect getCropRect() {
            return this.cropRect;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getRotation() {
            return this.rotation;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getSampleSize() {
            return this.sampleSize;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Uri getUriContent() {
            return this.uriContent;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Rect getWholeImageRect() {
            return this.wholeImageRect;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropImageView$d;", "", "<init>", "(Ljava/lang/String;I)V", "RECTANGLE", "OVAL", "RECTANGLE_VERTICAL_ONLY", "RECTANGLE_HORIZONTAL_ONLY", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        RECTANGLE,
        OVAL,
        RECTANGLE_VERTICAL_ONLY,
        RECTANGLE_HORIZONTAL_ONLY;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropImageView$e;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "ON_TOUCH", "ON", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum e {
        OFF,
        ON_TOUCH,
        ON;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/canhub/cropper/CropImageView$f;", "", "Lcom/canhub/cropper/CropImageView;", "view", "Lcom/canhub/cropper/CropImageView$c;", "result", "Ljn0/h0;", "onCropImageComplete", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$c;)V", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface f {
        void onCropImageComplete(CropImageView view, c result);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView$g;", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface g {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView$h;", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface h {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView$i;", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface i {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/canhub/cropper/CropImageView$j;", "", "Lcom/canhub/cropper/CropImageView;", "view", "Landroid/net/Uri;", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "Ljn0/h0;", "onSetImageUriComplete", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface j {
        void onSetImageUriComplete(CropImageView view, Uri uri, Exception error);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/canhub/cropper/CropImageView$k;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "SAMPLING", "RESIZE_INSIDE", "RESIZE_FIT", "RESIZE_EXACT", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum k {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<k> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropImageView$l;", "", "<init>", "(Ljava/lang/String;I)V", "FIT_CENTER", "CENTER", "CENTER_CROP", "CENTER_INSIDE", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum l {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<l> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CropImageView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void b(float width, float height, boolean center, boolean animate) {
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            float fMax = BitmapDescriptorFactory.HUE_RED;
            if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.mImageInverseMatrix.mapRect(cropWindowRect);
            this.mImageMatrix.reset();
            float f11 = 2;
            this.mImageMatrix.postTranslate((width - bitmap.getWidth()) / f11, (height - bitmap.getHeight()) / f11);
            j();
            int i11 = this.mDegreesRotated;
            if (i11 > 0) {
                com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
                this.mImageMatrix.postRotate(i11, cVar.w(this.mImagePoints), cVar.x(this.mImagePoints));
                j();
            }
            com.canhub.cropper.c cVar2 = com.canhub.cropper.c.f21036a;
            float fMin = Math.min(width / cVar2.D(this.mImagePoints), height / cVar2.z(this.mImagePoints));
            l lVar = this.mScaleType;
            if (lVar == l.FIT_CENTER || ((lVar == l.CENTER_INSIDE && fMin < 1.0f) || (fMin > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(fMin, fMin, cVar2.w(this.mImagePoints), cVar2.x(this.mImagePoints));
                j();
            } else if (lVar == l.CENTER_CROP) {
                this.mZoom = Math.max(getWidth() / cVar2.D(this.mImagePoints), getHeight() / cVar2.z(this.mImagePoints));
            }
            float f12 = this.mFlipHorizontally ? -this.mZoom : this.mZoom;
            float f13 = this.mFlipVertically ? -this.mZoom : this.mZoom;
            this.mImageMatrix.postScale(f12, f13, cVar2.w(this.mImagePoints), cVar2.x(this.mImagePoints));
            j();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (this.mScaleType == l.CENTER_CROP && center && !animate) {
                this.mZoomOffsetX = BitmapDescriptorFactory.HUE_RED;
                this.mZoomOffsetY = BitmapDescriptorFactory.HUE_RED;
            } else if (center) {
                this.mZoomOffsetX = width > cVar2.D(this.mImagePoints) ? 0.0f : Math.max(Math.min((width / f11) - cropWindowRect.centerX(), -cVar2.A(this.mImagePoints)), getWidth() - cVar2.B(this.mImagePoints)) / f12;
                if (height <= cVar2.z(this.mImagePoints)) {
                    fMax = Math.max(Math.min((height / f11) - cropWindowRect.centerY(), -cVar2.C(this.mImagePoints)), getHeight() - cVar2.v(this.mImagePoints)) / f13;
                }
                this.mZoomOffsetY = fMax;
            } else {
                this.mZoomOffsetX = Math.min(Math.max(this.mZoomOffsetX * f12, -cropWindowRect.left), (-cropWindowRect.right) + width) / f12;
                this.mZoomOffsetY = Math.min(Math.max(this.mZoomOffsetY * f13, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / f13;
            }
            this.mImageMatrix.postTranslate(this.mZoomOffsetX * f12, this.mZoomOffsetY * f13);
            cropWindowRect.offset(this.mZoomOffsetX * f12, this.mZoomOffsetY * f13);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            j();
            this.mCropOverlayView.invalidate();
            if (animate) {
                com.canhub.cropper.k kVar = this.mAnimation;
                p013kotlin.jvm.internal.s.h(kVar);
                kVar.a(this.mImagePoints, this.mImageMatrix);
                this.imageView.startAnimation(this.mAnimation);
            } else {
                this.imageView.setImageMatrix(this.mImageMatrix);
            }
            r(false);
        }
    }

    private final void c() {
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null && (this.mImageResource > 0 || this.imageUri != null)) {
            p013kotlin.jvm.internal.s.h(bitmap);
            bitmap.recycle();
        }
        this.originalBitmap = null;
        this.mImageResource = 0;
        this.imageUri = null;
        this.loadedSampleSize = 1;
        this.mDegreesRotated = 0;
        this.mZoom = 1.0f;
        this.mZoomOffsetX = BitmapDescriptorFactory.HUE_RED;
        this.mZoomOffsetY = BitmapDescriptorFactory.HUE_RED;
        this.mImageMatrix.reset();
        this.mRestoreCropWindowRect = null;
        this.mRestoreDegreesRotated = 0;
        this.imageView.setImageBitmap(null);
        o();
    }

    public static /* synthetic */ Bitmap h(CropImageView cropImageView, int i11, int i12, k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            kVar = k.RESIZE_INSIDE;
        }
        return cropImageView.g(i11, i12, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    private final void i(boolean inProgress, boolean animate) {
        float fMax;
        int width = getWidth();
        int height = getHeight();
        if (this.originalBitmap == null || width <= 0 || height <= 0) {
            return;
        }
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        if (inProgress) {
            if (cropWindowRect.left < BitmapDescriptorFactory.HUE_RED || cropWindowRect.top < BitmapDescriptorFactory.HUE_RED || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                b(width, height, false, false);
                return;
            }
            return;
        }
        if (this.mAutoZoomEnabled || this.mZoom > 1.0f) {
            if (this.mZoom < this.mMaxZoom) {
                float f11 = width;
                if (cropWindowRect.width() < f11 * 0.5f) {
                    float f12 = height;
                    if (cropWindowRect.height() < 0.5f * f12) {
                        fMax = Math.min(this.mMaxZoom, Math.min(f11 / ((cropWindowRect.width() / this.mZoom) / 0.64f), f12 / ((cropWindowRect.height() / this.mZoom) / 0.64f)));
                    } else {
                        fMax = 0.0f;
                    }
                } else {
                    fMax = 0.0f;
                }
            } else {
                fMax = 0.0f;
            }
            if (this.mZoom > 1.0f) {
                float f13 = width;
                if (cropWindowRect.width() > f13 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                    fMax = Math.max(1.0f, Math.min(f13 / ((cropWindowRect.width() / this.mZoom) / 0.51f), height / ((cropWindowRect.height() / this.mZoom) / 0.51f)));
                }
            }
            float f14 = this.mAutoZoomEnabled ? fMax : 1.0f;
            if (f14 <= BitmapDescriptorFactory.HUE_RED || f14 == this.mZoom) {
                return;
            }
            if (animate) {
                if (this.mAnimation == null) {
                    this.mAnimation = new com.canhub.cropper.k(this.imageView, this.mCropOverlayView);
                }
                com.canhub.cropper.k kVar = this.mAnimation;
                p013kotlin.jvm.internal.s.h(kVar);
                kVar.b(this.mImagePoints, this.mImageMatrix);
            }
            this.mZoom = f14;
            b(width, height, true, animate);
        }
    }

    private final void j() {
        float[] fArr = this.mImagePoints;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Bitmap bitmap = this.originalBitmap;
        p013kotlin.jvm.internal.s.h(bitmap);
        fArr[2] = bitmap.getWidth();
        float[] fArr2 = this.mImagePoints;
        fArr2[3] = 0.0f;
        Bitmap bitmap2 = this.originalBitmap;
        p013kotlin.jvm.internal.s.h(bitmap2);
        fArr2[4] = bitmap2.getWidth();
        float[] fArr3 = this.mImagePoints;
        Bitmap bitmap3 = this.originalBitmap;
        p013kotlin.jvm.internal.s.h(bitmap3);
        fArr3[5] = bitmap3.getHeight();
        float[] fArr4 = this.mImagePoints;
        fArr4[6] = 0.0f;
        Bitmap bitmap4 = this.originalBitmap;
        p013kotlin.jvm.internal.s.h(bitmap4);
        fArr4[7] = bitmap4.getHeight();
        this.mImageMatrix.mapPoints(this.mImagePoints);
        float[] fArr5 = this.mScaleImagePoints;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.mImageMatrix.mapPoints(fArr5);
    }

    private final void n(Bitmap bitmap, int imageResource, Uri imageUri, int loadSampleSize, int degreesRotated) {
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 == null || !p013kotlin.jvm.internal.s.f(bitmap2, bitmap)) {
            c();
            this.originalBitmap = bitmap;
            this.imageView.setImageBitmap(bitmap);
            this.imageUri = imageUri;
            this.mImageResource = imageResource;
            this.loadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.t();
                o();
            }
        }
    }

    private final void o() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.originalBitmap == null) ? 4 : 0);
        }
    }

    private final void p() {
        this.mProgressBar.setVisibility(this.mShowProgressBar && ((this.originalBitmap == null && this.bitmapLoadingWorkerJob != null) || this.bitmapCroppingWorkerJob != null) ? 0 : 4);
    }

    private final void r(boolean clear) {
        if (this.originalBitmap != null && !clear) {
            float f11 = this.loadedSampleSize * 100.0f;
            com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
            float fD = f11 / cVar.D(this.mScaleImagePoints);
            float fZ = (this.loadedSampleSize * 100.0f) / cVar.z(this.mScaleImagePoints);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            cropOverlayView.setCropWindowLimits(getWidth(), getHeight(), fD, fZ);
        }
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView2);
        cropOverlayView2.setBounds(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    @Override // com.canhub.cropper.CropOverlayView.b
    public void a(boolean inProgress) {
        i(inProgress, true);
    }

    public final void d(Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, k options, Uri customOutputUri) {
        p013kotlin.jvm.internal.s.k(saveCompressFormat, "saveCompressFormat");
        p013kotlin.jvm.internal.s.k(options, "options");
        if (this.mOnCropImageCompleteListener == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        q(reqWidth, reqHeight, options, saveCompressFormat, saveCompressQuality, customOutputUri);
    }

    public final void e() {
        this.mFlipHorizontally = !this.mFlipHorizontally;
        b(getWidth(), getHeight(), true, false);
    }

    public final void f() {
        this.mFlipVertically = !this.mFlipVertically;
        b(getWidth(), getHeight(), true, false);
    }

    public final Bitmap g(int reqWidth, int reqHeight, k options) {
        Bitmap bitmapA;
        p013kotlin.jvm.internal.s.k(options, "options");
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        k kVar = k.NONE;
        int i11 = options != kVar ? reqWidth : 0;
        int i12 = options != kVar ? reqHeight : 0;
        if (this.imageUri == null || (this.loadedSampleSize <= 1 && options != k.SAMPLING)) {
            com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
            float[] cropPoints = getCropPoints();
            int i13 = this.mDegreesRotated;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            bitmapA = cVar.g(bitmap, cropPoints, i13, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), this.mFlipHorizontally, this.mFlipVertically).getBitmap();
        } else {
            com.canhub.cropper.c cVar2 = com.canhub.cropper.c.f21036a;
            Context context = getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            Uri uri = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i14 = this.mDegreesRotated;
            Bitmap bitmap2 = this.originalBitmap;
            p013kotlin.jvm.internal.s.h(bitmap2);
            int width = bitmap2.getWidth() * this.loadedSampleSize;
            Bitmap bitmap3 = this.originalBitmap;
            p013kotlin.jvm.internal.s.h(bitmap3);
            int height = bitmap3.getHeight() * this.loadedSampleSize;
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView2);
            bitmapA = cVar2.d(context, uri, cropPoints2, i14, width, height, cropOverlayView2.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), i11, i12, this.mFlipHorizontally, this.mFlipVertically).getBitmap();
        }
        return com.canhub.cropper.c.f21036a.G(bitmapA, i11, i12, options);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getMAspectRatioX()), Integer.valueOf(this.mCropOverlayView.getMAspectRatioY()));
    }

    public final b getCornerShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    /* JADX INFO: renamed from: getCropLabelText, reason: from getter */
    public final String getMCropTextLabel() {
        return this.mCropTextLabel;
    }

    /* JADX INFO: renamed from: getCropLabelTextColor, reason: from getter */
    public final int getMCropLabelTextColor() {
        return this.mCropLabelTextColor;
    }

    /* JADX INFO: renamed from: getCropLabelTextSize, reason: from getter */
    public final float getMCropLabelTextSize() {
        return this.mCropLabelTextSize;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f11 = cropWindowRect.left;
        float f12 = cropWindowRect.top;
        float f13 = cropWindowRect.right;
        float f14 = cropWindowRect.bottom;
        float[] fArr = {f11, f12, f13, f12, f13, f14, f11, f14};
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr2[i11] = fArr[i11] * this.loadedSampleSize;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i11 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i11;
        int height = bitmap.getHeight() * i11;
        com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        return cVar.y(cropPoints, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY());
    }

    public final d getCropShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        return h(this, 0, 0, null, 7, null);
    }

    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    public final e getGuidelines() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    /* JADX INFO: renamed from: getImageResource, reason: from getter */
    public final int getMImageResource() {
        return this.mImageResource;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* JADX INFO: renamed from: getMaxZoom, reason: from getter */
    public final int getMMaxZoom() {
        return this.mMaxZoom;
    }

    /* JADX INFO: renamed from: getRotatedDegrees, reason: from getter */
    public final int getMDegreesRotated() {
        return this.mDegreesRotated;
    }

    /* JADX INFO: renamed from: getScaleType, reason: from getter */
    public final l getMScaleType() {
        return this.mScaleType;
    }

    public final Rect getWholeImageRect() {
        int i11 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i11, bitmap.getHeight() * i11);
    }

    public final void k(a.Result result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        this.bitmapCroppingWorkerJob = null;
        p();
        f fVar = this.mOnCropImageCompleteListener;
        if (fVar != null) {
            fVar.onCropImageComplete(this, new c(this.originalBitmap, this.imageUri, result.getBitmap(), result.getUri(), result.getError(), getCropPoints(), getCropRect(), getWholeImageRect(), getMDegreesRotated(), result.getSampleSize()));
        }
    }

    public final void l(com.canhub.cropper.b.Result result) {
        CropImageView cropImageView;
        p013kotlin.jvm.internal.s.k(result, "result");
        this.bitmapLoadingWorkerJob = null;
        p();
        if (result.getError() == null) {
            this.mInitialDegreesRotated = result.getDegreesRotated();
            this.mFlipHorizontally = result.getFlipHorizontally();
            this.mFlipVertically = result.getFlipVertically();
            cropImageView = this;
            cropImageView.n(result.getBitmap(), 0, result.getUri(), result.getLoadSampleSize(), result.getDegreesRotated());
        } else {
            cropImageView = this;
        }
        j jVar = cropImageView.mOnSetImageUriCompleteListener;
        if (jVar != null) {
            jVar.onSetImageUriComplete(this, result.getUri(), result.getError());
        }
    }

    public final void m(int degrees) {
        if (this.originalBitmap != null) {
            int i11 = degrees < 0 ? (degrees % 360) + 360 : degrees % 360;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            boolean z11 = !cropOverlayView.getIsFixAspectRatio() && ((46 <= i11 && i11 < 135) || (216 <= i11 && i11 < 305));
            com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
            cVar.u().set(this.mCropOverlayView.getCropWindowRect());
            RectF rectFU = cVar.u();
            float fHeight = (z11 ? rectFU.height() : rectFU.width()) / 2.0f;
            RectF rectFU2 = cVar.u();
            float fWidth = (z11 ? rectFU2.width() : rectFU2.height()) / 2.0f;
            if (z11) {
                boolean z12 = this.mFlipHorizontally;
                this.mFlipHorizontally = this.mFlipVertically;
                this.mFlipVertically = z12;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            cVar.s()[0] = cVar.u().centerX();
            cVar.s()[1] = cVar.u().centerY();
            cVar.s()[2] = 0.0f;
            cVar.s()[3] = 0.0f;
            cVar.s()[4] = 1.0f;
            cVar.s()[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(cVar.s());
            this.mDegreesRotated = (this.mDegreesRotated + i11) % 360;
            b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(cVar.t(), cVar.s());
            float fSqrt = this.mZoom / ((float) Math.sqrt(Math.pow(cVar.t()[4] - cVar.t()[2], 2.0d) + Math.pow(cVar.t()[5] - cVar.t()[3], 2.0d)));
            this.mZoom = fSqrt;
            this.mZoom = Math.max(fSqrt, 1.0f);
            b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(cVar.t(), cVar.s());
            float fSqrt2 = (float) Math.sqrt(Math.pow(cVar.t()[4] - cVar.t()[2], 2.0d) + Math.pow(cVar.t()[5] - cVar.t()[3], 2.0d));
            float f11 = fHeight * fSqrt2;
            float f12 = fWidth * fSqrt2;
            cVar.u().set(cVar.t()[0] - f11, cVar.t()[1] - f12, cVar.t()[0] + f11, cVar.t()[1] + f12);
            this.mCropOverlayView.t();
            this.mCropOverlayView.setCropWindowRect(cVar.u());
            b(getWidth(), getHeight(), true, false);
            i(false, false);
            this.mCropOverlayView.m();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        super.onLayout(changed, l11, t11, r11, b11);
        if (this.mLayoutWidth <= 0 || this.mLayoutHeight <= 0) {
            r(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.mLayoutWidth;
        layoutParams.height = this.mLayoutHeight;
        setLayoutParams(layoutParams);
        if (this.originalBitmap == null) {
            r(true);
            return;
        }
        float f11 = r11 - l11;
        float f12 = b11 - t11;
        b(f11, f12, true, false);
        RectF rectF = this.mRestoreCropWindowRect;
        if (rectF == null) {
            if (this.mSizeChanged) {
                this.mSizeChanged = false;
                i(false, false);
                return;
            }
            return;
        }
        int i11 = this.mRestoreDegreesRotated;
        if (i11 != this.mInitialDegreesRotated) {
            this.mDegreesRotated = i11;
            b(f11, f12, true, false);
            this.mRestoreDegreesRotated = 0;
        }
        this.mImageMatrix.mapRect(this.mRestoreCropWindowRect);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        i(false, false);
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        if (cropOverlayView2 != null) {
            cropOverlayView2.m();
        }
        this.mRestoreCropWindowRect = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int height;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? ((double) size) / ((double) bitmap.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? ((double) size2) / ((double) bitmap.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) bitmap.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) bitmap.getWidth()) * height2);
            height = size2;
        }
        Companion companion = INSTANCE;
        int iA = companion.a(mode, size, width);
        int iA2 = companion.a(mode2, size2, height);
        this.mLayoutWidth = iA;
        this.mLayoutHeight = iA2;
        setMeasuredDimension(iA, iA2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        CropImageView cropImageView;
        Bitmap bitmap;
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        if (this.bitmapLoadingWorkerJob == null && this.imageUri == null && this.originalBitmap == null && this.mImageResource == 0) {
            Bundle bundle = (Bundle) state;
            Parcelable parcelable = bundle.getParcelable("LOADED_IMAGE_URI");
            if (!(parcelable instanceof Uri)) {
                parcelable = null;
            }
            Uri uri = (Uri) parcelable;
            if (uri != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string == null) {
                    cropImageView = this;
                } else {
                    com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
                    Pair<String, WeakReference<Bitmap>> pairQ = cVar.q();
                    if (pairQ != null) {
                        bitmap = p013kotlin.jvm.internal.s.f(pairQ.first, string) ? (Bitmap) ((WeakReference) pairQ.second).get() : null;
                    } else {
                        bitmap = null;
                    }
                    cVar.I(null);
                    if (bitmap == null || bitmap.isRecycled()) {
                        cropImageView = this;
                    } else {
                        cropImageView = this;
                        cropImageView.n(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                }
                if (cropImageView.imageUri == null) {
                    setImageUriAsync(uri);
                    h0 h0Var = h0.f84049a;
                }
            } else {
                cropImageView = this;
                int i11 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i11 > 0) {
                    setImageResource(i11);
                    h0 h0Var2 = h0.f84049a;
                } else {
                    Parcelable parcelable2 = bundle.getParcelable("LOADING_IMAGE_URI");
                    if (!(parcelable2 instanceof Uri)) {
                        parcelable2 = null;
                    }
                    Uri uri2 = (Uri) parcelable2;
                    if (uri2 != null) {
                        setImageUriAsync(uri2);
                        h0 h0Var3 = h0.f84049a;
                    }
                }
            }
            int i12 = bundle.getInt("DEGREES_ROTATED");
            cropImageView.mRestoreDegreesRotated = i12;
            cropImageView.mDegreesRotated = i12;
            Parcelable parcelable3 = bundle.getParcelable("INITIAL_CROP_RECT");
            if (!(parcelable3 instanceof Rect)) {
                parcelable3 = null;
            }
            Rect rect = (Rect) parcelable3;
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                CropOverlayView cropOverlayView = cropImageView.mCropOverlayView;
                p013kotlin.jvm.internal.s.h(cropOverlayView);
                cropOverlayView.setInitialCropWindowRect(rect);
            }
            Parcelable parcelable4 = bundle.getParcelable("CROP_WINDOW_RECT");
            if (!(parcelable4 instanceof RectF)) {
                parcelable4 = null;
            }
            RectF rectF = (RectF) parcelable4;
            if (rectF != null && (rectF.width() > BitmapDescriptorFactory.HUE_RED || rectF.height() > BitmapDescriptorFactory.HUE_RED)) {
                cropImageView.mRestoreCropWindowRect = rectF;
            }
            CropOverlayView cropOverlayView2 = cropImageView.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView2);
            String string2 = bundle.getString("CROP_SHAPE");
            p013kotlin.jvm.internal.s.h(string2);
            cropOverlayView2.setCropShape(d.valueOf(string2));
            cropImageView.mAutoZoomEnabled = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            cropImageView.mMaxZoom = bundle.getInt("CROP_MAX_ZOOM");
            cropImageView.mFlipHorizontally = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            cropImageView.mFlipVertically = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            boolean z11 = bundle.getBoolean("SHOW_CROP_LABEL");
            cropImageView.mShowCropLabel = z11;
            cropImageView.mCropOverlayView.setCropperTextLabelVisibility(z11);
        }
        Parcelable parcelable5 = ((Bundle) state).getParcelable("instanceState");
        super.onRestoreInstanceState(parcelable5 != null ? parcelable5 : null);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Uri uriK;
        if (this.imageUri == null && this.originalBitmap == null && this.mImageResource < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.mImageResource < 1) {
            com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
            Context context = getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            uriK = cVar.K(context, this.originalBitmap, this.customOutputUri);
        } else {
            uriK = this.imageUri;
        }
        if (uriK != null && this.originalBitmap != null) {
            String string = UUID.randomUUID().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            com.canhub.cropper.c.f21036a.I(new Pair<>(string, new WeakReference(this.originalBitmap)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference<com.canhub.cropper.b> weakReference = this.bitmapLoadingWorkerJob;
        com.canhub.cropper.b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.getUri());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriK);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.loadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getMInitialCropWindowRect());
        com.canhub.cropper.c cVar2 = com.canhub.cropper.c.f21036a;
        cVar2.u().set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(cVar2.u());
        bundle.putParcelable("CROP_WINDOW_RECT", cVar2.u());
        d cropShape = this.mCropOverlayView.getCropShape();
        p013kotlin.jvm.internal.s.h(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.mAutoZoomEnabled);
        bundle.putInt("CROP_MAX_ZOOM", this.mMaxZoom);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.mFlipHorizontally);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.mFlipVertically);
        bundle.putBoolean("SHOW_CROP_LABEL", this.mShowCropLabel);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void q(int r22, int r23, com.canhub.cropper.CropImageView.k r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.q(int, int, com.canhub.cropper.CropImageView$k, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    public final void setAspectRatio(int aspectRatioX, int aspectRatioY) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setAspectRatioX(aspectRatioX);
        this.mCropOverlayView.setAspectRatioY(aspectRatioY);
        this.mCropOverlayView.setFixedAspectRatio(true);
    }

    public final void setAutoZoomEnabled(boolean z11) {
        if (this.mAutoZoomEnabled != z11) {
            this.mAutoZoomEnabled = z11;
            i(false, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        if (cropOverlayView.u(centerMoveEnabled)) {
            i(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(b bVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        p013kotlin.jvm.internal.s.h(bVar);
        cropOverlayView.setCropCornerShape(bVar);
    }

    public final void setCropLabelText(String cropLabelText) {
        p013kotlin.jvm.internal.s.k(cropLabelText, "cropLabelText");
        this.mCropTextLabel = cropLabelText;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i11) {
        this.mCropLabelTextColor = i11;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i11);
        }
    }

    public final void setCropLabelTextSize(float f11) {
        this.mCropLabelTextSize = getMCropLabelTextSize();
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f11);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(d dVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        p013kotlin.jvm.internal.s.h(dVar);
        cropOverlayView.setCropShape(dVar);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z11) {
        if (this.mFlipHorizontally != z11) {
            this.mFlipHorizontally = z11;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z11) {
        if (this.mFlipVertically != z11) {
            this.mFlipVertically = z11;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(e eVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        p013kotlin.jvm.internal.s.h(eVar);
        cropOverlayView.setGuidelines(eVar);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        n(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        p013kotlin.jvm.internal.s.k(options, "options");
        setScaleType(options.scaleType);
        this.customOutputUri = options.customOutputUri;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.multiTouchEnabled);
        setCenterMoveEnabled(options.centerMoveEnabled);
        setShowCropOverlay(options.showCropOverlay);
        setShowProgressBar(options.showProgressBar);
        setAutoZoomEnabled(options.autoZoomEnabled);
        setMaxZoom(options.maxZoom);
        setFlippedHorizontally(options.flipHorizontally);
        setFlippedVertically(options.flipVertically);
        this.mAutoZoomEnabled = options.autoZoomEnabled;
        this.mShowCropOverlay = options.showCropOverlay;
        this.mShowProgressBar = options.showProgressBar;
        this.mProgressBar.setIndeterminateTintList(ColorStateList.valueOf(options.progressBarColor));
    }

    public final void setImageResource(int i11) {
        if (i11 != 0) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            n(BitmapFactory.decodeResource(getResources(), i11), i11, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        com.canhub.cropper.b bVar;
        if (uri != null) {
            WeakReference<com.canhub.cropper.b> weakReference = this.bitmapLoadingWorkerJob;
            if (weakReference != null && (bVar = weakReference.get()) != null) {
                bVar.f();
            }
            c();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            WeakReference<com.canhub.cropper.b> weakReference2 = new WeakReference<>(new com.canhub.cropper.b(context, this, uri));
            this.bitmapLoadingWorkerJob = weakReference2;
            com.canhub.cropper.b bVar2 = weakReference2.get();
            if (bVar2 != null) {
                bVar2.i();
            }
            p();
        }
    }

    public final void setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setMaxCropResultSize(maxCropResultWidth, maxCropResultHeight);
    }

    public final void setMaxZoom(int i11) {
        if (this.mMaxZoom == i11 || i11 <= 0) {
            return;
        }
        this.mMaxZoom = i11;
        i(false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setMinCropResultSize(minCropResultWidth, minCropResultHeight);
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        if (cropOverlayView.v(multiTouchEnabled)) {
            i(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(f listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    public final void setOnCropWindowChangedListener(i listener) {
    }

    public final void setOnSetCropOverlayMovedListener(g listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(h listener) {
    }

    public final void setOnSetImageUriCompleteListener(j listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public final void setRotatedDegrees(int i11) {
        int i12 = this.mDegreesRotated;
        if (i12 != i11) {
            m(i11 - i12);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z11) {
        this.isSaveBitmapToInstanceState = z11;
    }

    public final void setScaleType(l scaleType) {
        p013kotlin.jvm.internal.s.k(scaleType, "scaleType");
        if (scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            this.mZoom = 1.0f;
            this.mZoomOffsetY = BitmapDescriptorFactory.HUE_RED;
            this.mZoomOffsetX = BitmapDescriptorFactory.HUE_RED;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.t();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z11) {
        if (this.mShowCropLabel != z11) {
            this.mShowCropLabel = z11;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z11);
            }
        }
    }

    public final void setShowCropOverlay(boolean z11) {
        if (this.mShowCropOverlay != z11) {
            this.mShowCropOverlay = z11;
            o();
        }
    }

    public final void setShowProgressBar(boolean z11) {
        if (this.mShowProgressBar != z11) {
            this.mShowProgressBar = z11;
            p();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= BitmapDescriptorFactory.HUE_RED) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            p013kotlin.jvm.internal.s.h(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:17:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0296  */
    /* JADX WARN: Code duplicated, block: B:35:0x02fa  */
    public CropImageView(Context context, AttributeSet attributeSet) {
        CropImageOptions cropImageOptions;
        TypedArray typedArrayObtainStyledAttributes;
        CropImageOptions cropImageOptions2;
        boolean z11;
        Intent intent;
        Bundle bundleExtra;
        super(context, attributeSet);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.mImageMatrix = new Matrix();
        this.mImageInverseMatrix = new Matrix();
        this.mImagePoints = new float[8];
        this.mScaleImagePoints = new float[8];
        this.mShowCropOverlay = true;
        this.mCropTextLabel = "";
        this.mCropLabelTextSize = 20.0f;
        this.mCropLabelTextColor = -1;
        this.mShowProgressBar = true;
        this.mAutoZoomEnabled = true;
        this.loadedSampleSize = 1;
        this.mZoom = 1.0f;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            cropImageOptions = (CropImageOptions) (parcelable instanceof CropImageOptions ? parcelable : null);
            if (cropImageOptions == null) {
                if (attributeSet != null) {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f21157a, 0, 0);
                    p013kotlin.jvm.internal.s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                    cropImageOptions2 = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
                    this.isSaveBitmapToInstanceState = typedArrayObtainStyledAttributes.getBoolean(w.D, this.isSaveBitmapToInstanceState);
                    l lVar = l.values()[typedArrayObtainStyledAttributes.getInt(w.E, cropImageOptions2.scaleType.ordinal())];
                    d dVar = d.values()[typedArrayObtainStyledAttributes.getInt(w.F, cropImageOptions2.cropShape.ordinal())];
                    b bVar = b.values()[typedArrayObtainStyledAttributes.getInt(w.f21158b, cropImageOptions2.cornerShape.ordinal())];
                    e eVar = e.values()[typedArrayObtainStyledAttributes.getInt(w.f21174r, cropImageOptions2.guidelines.ordinal())];
                    int integer = typedArrayObtainStyledAttributes.getInteger(w.f21159c, cropImageOptions2.aspectRatioX);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(w.f21160d, cropImageOptions2.aspectRatioY);
                    boolean z12 = typedArrayObtainStyledAttributes.getBoolean(w.f21161e, cropImageOptions2.autoZoomEnabled);
                    boolean z13 = typedArrayObtainStyledAttributes.getBoolean(w.C, cropImageOptions2.multiTouchEnabled);
                    boolean z14 = typedArrayObtainStyledAttributes.getBoolean(w.f21169m, cropImageOptions2.centerMoveEnabled);
                    float dimension = typedArrayObtainStyledAttributes.getDimension(w.f21171o, cropImageOptions2.cropCornerRadius);
                    float dimension2 = typedArrayObtainStyledAttributes.getDimension(w.J, cropImageOptions2.snapRadius);
                    float dimension3 = typedArrayObtainStyledAttributes.getDimension(w.K, cropImageOptions2.touchRadius);
                    float f11 = typedArrayObtainStyledAttributes.getFloat(w.f21177u, cropImageOptions2.initialCropWindowPaddingRatio);
                    int integer3 = typedArrayObtainStyledAttributes.getInteger(w.f21170n, cropImageOptions2.circleCornerFillColorHexValue);
                    float dimension4 = typedArrayObtainStyledAttributes.getDimension(w.f21168l, cropImageOptions2.borderLineThickness);
                    int integer4 = typedArrayObtainStyledAttributes.getInteger(w.f21167k, cropImageOptions2.borderLineColor);
                    float dimension5 = typedArrayObtainStyledAttributes.getDimension(w.f21166j, cropImageOptions2.borderCornerThickness);
                    float dimension6 = typedArrayObtainStyledAttributes.getDimension(w.f21165i, cropImageOptions2.borderCornerOffset);
                    float dimension7 = typedArrayObtainStyledAttributes.getDimension(w.f21164h, cropImageOptions2.borderCornerLength);
                    int integer5 = typedArrayObtainStyledAttributes.getInteger(w.f21163g, cropImageOptions2.borderCornerColor);
                    float dimension8 = typedArrayObtainStyledAttributes.getDimension(w.f21176t, cropImageOptions2.guidelinesThickness);
                    int integer6 = typedArrayObtainStyledAttributes.getInteger(w.f21175s, cropImageOptions2.guidelinesColor);
                    int integer7 = typedArrayObtainStyledAttributes.getInteger(w.f21162f, cropImageOptions2.backgroundColor);
                    int dimension9 = (int) typedArrayObtainStyledAttributes.getDimension(w.B, cropImageOptions2.minCropWindowWidth);
                    int dimension10 = (int) typedArrayObtainStyledAttributes.getDimension(w.A, cropImageOptions2.minCropWindowHeight);
                    int i11 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21182z, cropImageOptions2.minCropResultWidth);
                    int i12 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21181y, cropImageOptions2.minCropResultHeight);
                    int i13 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21179w, cropImageOptions2.maxCropResultWidth);
                    int i14 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21178v, cropImageOptions2.maxCropResultHeight);
                    boolean z15 = typedArrayObtainStyledAttributes.getBoolean(w.f21173q, cropImageOptions2.flipHorizontally);
                    boolean z16 = typedArrayObtainStyledAttributes.getBoolean(w.f21173q, cropImageOptions2.flipVertically);
                    float dimension11 = typedArrayObtainStyledAttributes.getDimension(w.N, cropImageOptions2.cropperLabelTextSize);
                    int integer8 = typedArrayObtainStyledAttributes.getInteger(w.M, cropImageOptions2.cropperLabelTextColor);
                    boolean z17 = typedArrayObtainStyledAttributes.getBoolean(w.H, cropImageOptions2.showCropLabel);
                    int integer9 = typedArrayObtainStyledAttributes.getInteger(w.f21180x, cropImageOptions2.maxZoom);
                    boolean z18 = typedArrayObtainStyledAttributes.getBoolean(w.G, cropImageOptions2.showCropOverlay);
                    boolean z19 = typedArrayObtainStyledAttributes.getBoolean(w.I, cropImageOptions2.showProgressBar);
                    String string = typedArrayObtainStyledAttributes.getString(w.L);
                    if (typedArrayObtainStyledAttributes.getBoolean(w.f21172p, cropImageOptions2.fixAspectRatio)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    CropImageOptions cropImageOptions3 = new CropImageOptions(false, false, dVar, bVar, dimension, dimension2, dimension3, eVar, lVar, z18, z17, z19, 0, z12, z13, z14, false, integer9, f11, z11, integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i11, i12, i13, i14, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, z15, z16, null, 0, false, false, null, null, dimension11, integer8, string, 0, null, null, null, null, 69635, 1061158848, 62, null);
                    typedArrayObtainStyledAttributes.recycle();
                    cropImageOptions = cropImageOptions3;
                } else {
                    cropImageOptions = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
                }
            }
        } else if (attributeSet != null) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f21157a, 0, 0);
            p013kotlin.jvm.internal.s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            cropImageOptions2 = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
            try {
                this.isSaveBitmapToInstanceState = typedArrayObtainStyledAttributes.getBoolean(w.D, this.isSaveBitmapToInstanceState);
                l lVar2 = l.values()[typedArrayObtainStyledAttributes.getInt(w.E, cropImageOptions2.scaleType.ordinal())];
                d dVar2 = d.values()[typedArrayObtainStyledAttributes.getInt(w.F, cropImageOptions2.cropShape.ordinal())];
                b bVar2 = b.values()[typedArrayObtainStyledAttributes.getInt(w.f21158b, cropImageOptions2.cornerShape.ordinal())];
                e eVar2 = e.values()[typedArrayObtainStyledAttributes.getInt(w.f21174r, cropImageOptions2.guidelines.ordinal())];
                int integer10 = typedArrayObtainStyledAttributes.getInteger(w.f21159c, cropImageOptions2.aspectRatioX);
                int integer11 = typedArrayObtainStyledAttributes.getInteger(w.f21160d, cropImageOptions2.aspectRatioY);
                boolean z110 = typedArrayObtainStyledAttributes.getBoolean(w.f21161e, cropImageOptions2.autoZoomEnabled);
                boolean z111 = typedArrayObtainStyledAttributes.getBoolean(w.C, cropImageOptions2.multiTouchEnabled);
                boolean z112 = typedArrayObtainStyledAttributes.getBoolean(w.f21169m, cropImageOptions2.centerMoveEnabled);
                float dimension12 = typedArrayObtainStyledAttributes.getDimension(w.f21171o, cropImageOptions2.cropCornerRadius);
                float dimension13 = typedArrayObtainStyledAttributes.getDimension(w.J, cropImageOptions2.snapRadius);
                float dimension14 = typedArrayObtainStyledAttributes.getDimension(w.K, cropImageOptions2.touchRadius);
                float f12 = typedArrayObtainStyledAttributes.getFloat(w.f21177u, cropImageOptions2.initialCropWindowPaddingRatio);
                int integer12 = typedArrayObtainStyledAttributes.getInteger(w.f21170n, cropImageOptions2.circleCornerFillColorHexValue);
                float dimension15 = typedArrayObtainStyledAttributes.getDimension(w.f21168l, cropImageOptions2.borderLineThickness);
                int integer13 = typedArrayObtainStyledAttributes.getInteger(w.f21167k, cropImageOptions2.borderLineColor);
                float dimension16 = typedArrayObtainStyledAttributes.getDimension(w.f21166j, cropImageOptions2.borderCornerThickness);
                float dimension17 = typedArrayObtainStyledAttributes.getDimension(w.f21165i, cropImageOptions2.borderCornerOffset);
                float dimension18 = typedArrayObtainStyledAttributes.getDimension(w.f21164h, cropImageOptions2.borderCornerLength);
                int integer14 = typedArrayObtainStyledAttributes.getInteger(w.f21163g, cropImageOptions2.borderCornerColor);
                float dimension19 = typedArrayObtainStyledAttributes.getDimension(w.f21176t, cropImageOptions2.guidelinesThickness);
                int integer15 = typedArrayObtainStyledAttributes.getInteger(w.f21175s, cropImageOptions2.guidelinesColor);
                int integer16 = typedArrayObtainStyledAttributes.getInteger(w.f21162f, cropImageOptions2.backgroundColor);
                int dimension20 = (int) typedArrayObtainStyledAttributes.getDimension(w.B, cropImageOptions2.minCropWindowWidth);
                int dimension110 = (int) typedArrayObtainStyledAttributes.getDimension(w.A, cropImageOptions2.minCropWindowHeight);
                int i15 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21182z, cropImageOptions2.minCropResultWidth);
                int i16 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21181y, cropImageOptions2.minCropResultHeight);
                int i17 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21179w, cropImageOptions2.maxCropResultWidth);
                int i18 = (int) typedArrayObtainStyledAttributes.getFloat(w.f21178v, cropImageOptions2.maxCropResultHeight);
                boolean z113 = typedArrayObtainStyledAttributes.getBoolean(w.f21173q, cropImageOptions2.flipHorizontally);
                boolean z114 = typedArrayObtainStyledAttributes.getBoolean(w.f21173q, cropImageOptions2.flipVertically);
                float dimension111 = typedArrayObtainStyledAttributes.getDimension(w.N, cropImageOptions2.cropperLabelTextSize);
                int integer17 = typedArrayObtainStyledAttributes.getInteger(w.M, cropImageOptions2.cropperLabelTextColor);
                boolean z115 = typedArrayObtainStyledAttributes.getBoolean(w.H, cropImageOptions2.showCropLabel);
                int integer18 = typedArrayObtainStyledAttributes.getInteger(w.f21180x, cropImageOptions2.maxZoom);
                boolean z116 = typedArrayObtainStyledAttributes.getBoolean(w.G, cropImageOptions2.showCropOverlay);
                boolean z117 = typedArrayObtainStyledAttributes.getBoolean(w.I, cropImageOptions2.showProgressBar);
                String string2 = typedArrayObtainStyledAttributes.getString(w.L);
                if (typedArrayObtainStyledAttributes.getBoolean(w.f21172p, cropImageOptions2.fixAspectRatio) || (typedArrayObtainStyledAttributes.hasValue(w.f21159c) && typedArrayObtainStyledAttributes.hasValue(w.f21159c))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                CropImageOptions cropImageOptions4 = new CropImageOptions(false, false, dVar2, bVar2, dimension12, dimension13, dimension14, eVar2, lVar2, z116, z115, z117, 0, z110, z111, z112, false, integer18, f12, z11, integer10, integer11, dimension15, integer13, dimension16, dimension17, dimension18, integer14, integer12, dimension19, integer15, integer16, dimension20, dimension110, i15, i16, i17, i18, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, z113, z114, null, 0, false, false, null, null, dimension111, integer17, string2, 0, null, null, null, null, 69635, 1061158848, 62, null);
                typedArrayObtainStyledAttributes.recycle();
                cropImageOptions = cropImageOptions4;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            cropImageOptions = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        }
        this.mScaleType = cropImageOptions.scaleType;
        this.mAutoZoomEnabled = cropImageOptions.autoZoomEnabled;
        this.mMaxZoom = cropImageOptions.maxZoom;
        this.mCropLabelTextSize = cropImageOptions.cropperLabelTextSize;
        this.mShowCropLabel = cropImageOptions.showCropLabel;
        this.mShowCropOverlay = cropImageOptions.showCropOverlay;
        this.mShowProgressBar = cropImageOptions.showProgressBar;
        this.mFlipHorizontally = cropImageOptions.flipHorizontally;
        this.mFlipVertically = cropImageOptions.flipVertically;
        View viewInflate = LayoutInflater.from(context).inflate(t.f21152b, (ViewGroup) this, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(s.f21144c);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(s.f21142a);
        this.mCropOverlayView = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(s.f21143b);
        this.mProgressBar = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(cropImageOptions.progressBarColor));
        p();
    }

    public final void setImageBitmap(Bitmap bitmap, e7.a exif) {
        int iB;
        Bitmap bitmap2;
        if (bitmap == null || exif == null) {
            iB = 0;
            bitmap2 = bitmap;
        } else {
            com.canhub.cropper.c.b bVarF = com.canhub.cropper.c.f21036a.F(bitmap, exif);
            Bitmap bitmapA = bVarF.getBitmap();
            iB = bVarF.getDegrees();
            this.mFlipHorizontally = bVarF.getFlipHorizontally();
            this.mFlipVertically = bVarF.getFlipVertically();
            this.mInitialDegreesRotated = bVarF.getDegrees();
            bitmap2 = bitmapA;
        }
        int i11 = iB;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        p013kotlin.jvm.internal.s.h(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        n(bitmap2, 0, null, 1, i11);
    }
}
