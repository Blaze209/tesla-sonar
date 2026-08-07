package com.swmansion.gesturehandler.core;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.Arrays;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b/\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u0000 è\u00012\u00020\u0001:\u0007ì\u0001\u0081\u0001~\u0084\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010%\u001a\n $*\u0004\u0018\u00010#0#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010,\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u0010-J\u000f\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u0010\u0003J\u0015\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0000¢\u0006\u0004\b5\u00106J=\u0010>\u001a\u00020\u00172\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u0002072\u0006\u0010=\u001a\u000207¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ!\u0010H\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0017H\u0014¢\u0006\u0004\bJ\u0010\u0003J\u0015\u0010K\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\bK\u0010)J\u0015\u0010L\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\bL\u0010)J\u001d\u0010N\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\bN\u0010\u0019J\u001d\u0010O\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\bO\u0010\u0019J\u000f\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u0004\u0018\u00010P¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bT\u0010\u0013J\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0000H\u0016¢\u0006\u0004\bV\u00106J\u0015\u0010W\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0000¢\u0006\u0004\bW\u00106J\u0017\u0010X\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0000H\u0016¢\u0006\u0004\bX\u00106J\u0017\u0010Y\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0000H\u0016¢\u0006\u0004\bY\u00106J'\u0010\\\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010Z\u001a\u0002072\u0006\u0010[\u001a\u000207¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020\u0017¢\u0006\u0004\b^\u0010\u0003J\r\u0010_\u001a\u00020\u0017¢\u0006\u0004\b_\u0010\u0003J\r\u0010`\u001a\u00020\u0017¢\u0006\u0004\b`\u0010\u0003J\u0017\u0010b\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\rH\u0016¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u0017¢\u0006\u0004\bd\u0010\u0003J\r\u0010e\u001a\u00020\u0017¢\u0006\u0004\be\u0010\u0003J\u0015\u0010g\u001a\u00020\r2\u0006\u0010f\u001a\u00020\u0000¢\u0006\u0004\bg\u00106J\u000f\u0010h\u001a\u00020\u0017H\u0016¢\u0006\u0004\bh\u0010\u0003J\u001f\u0010i\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\bi\u0010\u0019J\u001f\u0010j\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\bj\u0010\u0019J\u001f\u0010l\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\t2\u0006\u0010k\u001a\u00020\tH\u0014¢\u0006\u0004\bl\u00100J\u000f\u0010m\u001a\u00020\u0017H\u0014¢\u0006\u0004\bm\u0010\u0003J\u000f\u0010n\u001a\u00020\u0017H\u0014¢\u0006\u0004\bn\u0010\u0003J\u000f\u0010o\u001a\u00020\u0017H\u0014¢\u0006\u0004\bo\u0010\u0003J\u0017\u0010p\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0010H\u0004¢\u0006\u0004\bp\u0010\u0013J\u0017\u0010s\u001a\u00020q2\u0006\u0010r\u001a\u00020qH\u0004¢\u0006\u0004\bs\u0010tJ\r\u0010u\u001a\u00020\u0017¢\u0006\u0004\bu\u0010\u0003J\u001b\u0010x\u001a\u00020\u00172\f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00170v¢\u0006\u0004\bx\u0010yJ\u000f\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0085\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u007fR'\u0010\u0089\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0086\u0001\u0010\u0082\u0001\u001a\u0005\b\u0087\u0001\u0010\u000b\"\u0005\b\u0088\u0001\u0010)R-\u0010E\u001a\u0004\u0018\u00010D2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010D8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R)\u0010\u0091\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u0082\u0001\u001a\u0005\b\u0090\u0001\u0010\u000bR)\u0010\u0018\u001a\u0002072\u0007\u0010\u008a\u0001\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u00102\u001a\u0002072\u0007\u0010\u008a\u0001\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0093\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R*\u0010\u009c\u0001\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R1\u0010¡\u0001\u001a\u00020\r2\u0007\u0010\u009d\u0001\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0006\b\u009e\u0001\u0010\u0099\u0001\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001\"\u0005\b \u0001\u0010cR&\u0010£\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b`\u0010\u0082\u0001\u001a\u0005\b\u0093\u0001\u0010\u000b\"\u0005\b¢\u0001\u0010)R,\u0010¦\u0001\u001a\u0004\u0018\u00010P2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010P8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bb\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010RR,\u0010¨\u0001\u001a\u0004\u0018\u00010P2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010P8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0014\u0010¤\u0001\u001a\u0005\b§\u0001\u0010RR(\u0010ª\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b \u0010\u0082\u0001\u001a\u0005\b©\u0001\u0010\u000bR(\u0010¬\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\"\u0010\u0082\u0001\u001a\u0005\b«\u0001\u0010\u000bR\u001f\u0010¯\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010®\u0001R'\u0010²\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b^\u0010\u0099\u0001\u001a\u0006\b°\u0001\u0010\u009b\u0001\"\u0005\b±\u0001\u0010cR\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010´\u0001R+\u0010¸\u0001\u001a\u00030¶\u00012\b\u0010\u008a\u0001\u001a\u00030¶\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bS\u0010\u0090\u0001\u001a\u0006\b\u0082\u0001\u0010·\u0001R)\u0010º\u0001\u001a\u0002072\u0007\u0010\u008a\u0001\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bQ\u0010\u0093\u0001\u001a\u0006\b¹\u0001\u0010\u0095\u0001R)\u0010¼\u0001\u001a\u0002072\u0007\u0010\u008a\u0001\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b%\u0010\u0093\u0001\u001a\u0006\b»\u0001\u0010\u0095\u0001R\u0018\u0010½\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0099\u0001R\u0018\u0010¾\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0093\u0001R\u0018\u0010¿\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0093\u0001R/\u0010Â\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8\u0006@DX\u0086\u000e¢\u0006\u0015\n\u0005\b2\u0010\u0082\u0001\u001a\u0005\bÀ\u0001\u0010\u000b\"\u0005\bÁ\u0001\u0010)R'\u0010Å\u0001\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010\u0099\u0001\u001a\u0006\bÃ\u0001\u0010\u009b\u0001\"\u0005\bÄ\u0001\u0010cR)\u0010G\u001a\u0004\u0018\u00010F8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u001a\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R+\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\be\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010Ó\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010Ò\u0001R(\u0010Õ\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b_\u0010\u0082\u0001\u001a\u0005\bÔ\u0001\u0010\u000bR&\u0010Ø\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\n\u0010\u0082\u0001\u001a\u0005\bÖ\u0001\u0010\u000b\"\u0005\b×\u0001\u0010)R'\u0010Û\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0093\u0001\u0010\u0082\u0001\u001a\u0005\bÙ\u0001\u0010\u000b\"\u0005\bÚ\u0001\u0010)R(\u0010Ý\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÙ\u0001\u0010\u0099\u0001\u001a\u0006\b\u0099\u0001\u0010\u009b\u0001\"\u0005\bÜ\u0001\u0010cR'\u0010à\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010\u0099\u0001\u001a\u0006\bÞ\u0001\u0010\u009b\u0001\"\u0005\bß\u0001\u0010cR(\u0010ã\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0099\u0001\u001a\u0006\bá\u0001\u0010\u009b\u0001\"\u0005\bâ\u0001\u0010cR\u0014\u0010å\u0001\u001a\u0002078F¢\u0006\b\u001a\u0006\bä\u0001\u0010\u0095\u0001R\u0014\u0010ç\u0001\u001a\u0002078F¢\u0006\b\u001a\u0006\bæ\u0001\u0010\u0095\u0001R\u0014\u0010é\u0001\u001a\u0002078F¢\u0006\b\u001a\u0006\bè\u0001\u0010\u0095\u0001R\u0014\u0010ë\u0001\u001a\u0002078F¢\u0006\b\u001a\u0006\bê\u0001\u0010\u0095\u0001¨\u0006í\u0001"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "H", "(Landroid/content/Context;)Landroid/app/Activity;", "", "E", "()I", "pointerId", "", "e0", "(I)Z", "Landroid/view/MotionEvent;", "event", "i0", "(Landroid/view/MotionEvent;)Z", "m", "(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;", "sourceEvent", "Ljn0/h0;", "x", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "A", "z", "C", "r", "Lcom/swmansion/gesturehandler/core/GestureHandler$c;", "pointerData", "n", "(Lcom/swmansion/gesturehandler/core/GestureHandler$c;)V", "o", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "u", "(Lcom/swmansion/gesturehandler/core/GestureHandler$c;)Lcom/facebook/react/bridge/WritableMap;", "newState", "h0", "(I)V", "clickedButton", "b0", "F0", "(Landroid/view/MotionEvent;)V", "prevState", "w", "(II)V", "v", "y", "s0", "other", "Y", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "", "leftPad", "topPad", "rightPad", "bottomPad", Snapshot.WIDTH, Snapshot.HEIGHT, "z0", "(FFFFFF)V", "Ly90/c;", "controller", "A0", "(Ly90/c;)V", "Landroid/view/View;", "view", "Ly90/g;", "orchestrator", "q0", "(Landroid/view/View;Ly90/g;)V", "n0", "O0", "P0", "transformedEvent", "X", "R0", "Lcom/facebook/react/bridge/WritableArray;", "t", "()Lcom/facebook/react/bridge/WritableArray;", "s", "S0", "handler", "M0", "N0", "L0", "K0", "posX", "posY", "g0", "(Landroid/view/View;FF)Z", "q", "D", "k", "force", "l", "(Z)V", "p", "B", "of", "c0", "t0", "l0", "m0", "previousState", "p0", "o0", "j0", "k0", "J0", "Landroid/graphics/PointF;", "point", "Q0", "(Landroid/graphics/PointF;)Landroid/graphics/PointF;", "r0", "Lkotlin/Function0;", "closure", "T0", "(Lwn0/a;)V", "", "toString", "()Ljava/lang/String;", "", "a", "[I", "trackedPointerIDs", "b", "I", "trackedPointersIDsCount", "c", "windowOffset", DateTokenConverter.CONVERTER_KEY, "T", "I0", "tag", "value", "e", "Landroid/view/View;", "W", "()Landroid/view/View;", "f", "S", "state", "g", Gender.FEMALE, "getX", "()F", "h", "getY", IntegerTokenConverter.CONVERTER_KEY, "Z", "f0", "()Z", "isWithinBounds", "enabled", "j", "d0", "y0", "isEnabled", "u0", "actionType", "Lcom/facebook/react/bridge/WritableArray;", "getChangedTouchesPayload", "changedTouchesPayload", "getAllTouchesPayload", "allTouchesPayload", Gender.UNKNOWN, "touchEventType", "V", "trackedPointersCount", "", "[Lcom/swmansion/gesturehandler/core/GestureHandler$c;", "trackedPointers", Gender.NONE, "C0", "needsPointerData", "", "[F", "hitSlop", "", "()S", "eventCoalescingKey", "getLastAbsolutePositionX", "lastAbsolutePositionX", "getLastAbsolutePositionY", "lastAbsolutePositionY", "manualActivation", "lastEventOffsetX", "lastEventOffsetY", Gender.OTHER, "D0", "numberOfPointers", "getShouldCancelWhenOutside", "G0", "shouldCancelWhenOutside", "Ly90/g;", "P", "()Ly90/g;", "setOrchestrator", "(Ly90/g;)V", "Ly90/l;", "Ly90/l;", "getOnTouchEventListener", "()Ly90/l;", "E0", "(Ly90/l;)V", "onTouchEventListener", "Ly90/c;", "interactionController", "Q", "pointerType", "getMouseButton", "B0", "mouseButton", "G", "v0", "activationIndex", "w0", "isActive", "a0", "x0", "isAwaiting", "R", "H0", "shouldResetProgress", "L", "lastRelativePositionX", Gender.MALE, "lastRelativePositionY", "J", "lastPositionInWindowX", "K", "lastPositionInWindowY", "AdaptEventException", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class GestureHandler {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Void K = null;
    private static MotionEvent.PointerProperties[] L;
    private static MotionEvent.PointerCoords[] M;
    private static short N;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private y90.g orchestrator;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private y90.l onTouchEventListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private y90.c interactionController;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int pointerType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int mouseButton;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int activationIndex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isActive;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isAwaiting;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean shouldResetProgress;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int[] trackedPointerIDs = new int[12];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int trackedPointersIDsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int[] windowOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int tag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private View view;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float x;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float y;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isWithinBounds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int actionType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private WritableArray changedTouchesPayload;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private WritableArray allTouchesPayload;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int touchEventType;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int trackedPointersCount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final PointerData[] trackedPointers;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean needsPointerData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float[] hitSlop;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private short eventCoalescingKey;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float lastAbsolutePositionX;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float lastAbsolutePositionY;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean manualActivation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float lastEventOffsetX;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float lastEventOffsetY;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int numberOfPointers;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCancelWhenOutside;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handler", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "event", "Landroid/view/MotionEvent;", "e", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;Ljava/lang/IllegalArgumentException;)V", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdaptEventException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdaptEventException(GestureHandler handler, MotionEvent event, IllegalArgumentException e11) {
            super(t.n("\n    handler: " + o0.b(handler.getClass()).l() + "\n    state: " + handler.getState() + "\n    view: " + handler.getView() + "\n    orchestrator: " + handler.getOrchestrator() + "\n    isEnabled: " + handler.getIsEnabled() + "\n    isActive: " + handler.getIsActive() + "\n    isAwaiting: " + handler.getIsAwaiting() + "\n    trackedPointersCount: " + handler.trackedPointersIDsCount + "\n    trackedPointers: " + n.S0(handler.trackedPointerIDs, ", ", null, null, 0, null, null, 62, null) + "\n    while handling event: " + event + "\n      "), e11);
            s.k(handler, "handler");
            s.k(event, "event");
            s.k(e11, "e");
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.GestureHandler$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u001f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0017R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0017R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0017R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0017R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0017R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0017R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0017R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0017R\u001e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$a;", "", "<init>", "()V", "", "size", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(I)V", "", "value", "", "c", "(F)Z", "DEFAULT_NEEDS_POINTER_DATA", "Z", "DEFAULT_MANUAL_ACTIVATION", "DEFAULT_SHOULD_CANCEL_WHEN_OUTSIDE", "DEFAULT_IS_ENABLED", "", "DEFAULT_HIT_SLOP", "Ljava/lang/Void;", "DEFAULT_MOUSE_BUTTON", "I", "STATE_UNDETERMINED", "STATE_FAILED", "STATE_BEGAN", "STATE_CANCELLED", "STATE_ACTIVE", "STATE_END", "HIT_SLOP_NONE", Gender.FEMALE, "HIT_SLOP_LEFT_IDX", "HIT_SLOP_TOP_IDX", "HIT_SLOP_RIGHT_IDX", "HIT_SLOP_BOTTOM_IDX", "HIT_SLOP_WIDTH_IDX", "HIT_SLOP_HEIGHT_IDX", "DIRECTION_RIGHT", "DIRECTION_LEFT", "DIRECTION_UP", "DIRECTION_DOWN", "ACTION_TYPE_REANIMATED_WORKLET", "ACTION_TYPE_NATIVE_ANIMATED_EVENT", "ACTION_TYPE_JS_FUNCTION_OLD_API", "ACTION_TYPE_JS_FUNCTION_NEW_API", "POINTER_TYPE_TOUCH", "POINTER_TYPE_STYLUS", "POINTER_TYPE_MOUSE", "POINTER_TYPE_OTHER", "MAX_POINTERS_COUNT", "", "Landroid/view/MotionEvent$PointerProperties;", "pointerProps", "[Landroid/view/MotionEvent$PointerProperties;", "Landroid/view/MotionEvent$PointerCoords;", "pointerCoords", "[Landroid/view/MotionEvent$PointerCoords;", "", "nextEventCoalescingKey", "S", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(float value) {
            return !Float.isNaN(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int size) {
            if (GestureHandler.L == null) {
                GestureHandler.L = new MotionEvent.PointerProperties[12];
                GestureHandler.M = new MotionEvent.PointerCoords[12];
            }
            while (size > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = GestureHandler.L;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    s.B("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = size - 1;
                if (pointerPropertiesArr[i11] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = GestureHandler.L;
                if (pointerPropertiesArr2 == null) {
                    s.B("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = GestureHandler.M;
                if (pointerCoordsArr2 == null) {
                    s.B("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                size--;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \b*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/GestureHandler;", "", "handlerTag", "b", "(Landroid/content/Context;I)Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", "f", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "Lz90/b;", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lz90/b;", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b<T extends GestureHandler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.GestureHandler$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$b$a;", "", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "", "KEY_SHOULD_CANCEL_WHEN_OUTSIDE", "Ljava/lang/String;", "KEY_ENABLED", "KEY_NEEDS_POINTER_DATA", "KEY_MANUAL_ACTIVATION", "KEY_MOUSE_BUTTON", "KEY_HIT_SLOP", "KEY_HIT_SLOP_LEFT", "KEY_HIT_SLOP_TOP", "KEY_HIT_SLOP_RIGHT", "KEY_HIT_SLOP_BOTTOM", "KEY_HIT_SLOP_VERTICAL", "KEY_HIT_SLOP_HORIZONTAL", "KEY_HIT_SLOP_WIDTH", "KEY_HIT_SLOP_HEIGHT", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(GestureHandler handler, ReadableMap config) {
                if (config.getType("hitSlop") == ReadableType.Number) {
                    float fG = w.g(config.getDouble("hitSlop"));
                    handler.z0(fG, fG, fG, fG, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = config.getMap("hitSlop");
                s.h(map);
                float fG2 = map.hasKey("horizontal") ? w.g(map.getDouble("horizontal")) : Float.NaN;
                float fG3 = fG2;
                float fG4 = map.hasKey("vertical") ? w.g(map.getDouble("vertical")) : Float.NaN;
                float fG5 = fG4;
                if (map.hasKey("left")) {
                    fG2 = w.g(map.getDouble("left"));
                }
                float f11 = fG2;
                if (map.hasKey("top")) {
                    fG4 = w.g(map.getDouble("top"));
                }
                float f12 = fG4;
                if (map.hasKey("right")) {
                    fG3 = w.g(map.getDouble("right"));
                }
                float f13 = fG3;
                if (map.hasKey("bottom")) {
                    fG5 = w.g(map.getDouble("bottom"));
                }
                handler.z0(f11, f12, f13, fG5, map.hasKey(Snapshot.WIDTH) ? w.g(map.getDouble(Snapshot.WIDTH)) : Float.NaN, map.hasKey(Snapshot.HEIGHT) ? w.g(map.getDouble(Snapshot.HEIGHT)) : Float.NaN);
            }

            private Companion() {
            }
        }

        protected abstract T a(Context context);

        public final T b(Context context, int handlerTag) {
            T t11 = (T) a(context);
            t11.I0(handlerTag);
            return t11;
        }

        public abstract z90.b<T> c(T handler);

        public abstract String d();

        public abstract Class<T> e();

        public void f(T handler, ReadableMap config) {
            s.k(handler, "handler");
            s.k(config, "config");
            handler.s0();
            if (config.hasKey("shouldCancelWhenOutside")) {
                handler.G0(config.getBoolean("shouldCancelWhenOutside"));
            }
            if (config.hasKey("enabled")) {
                handler.y0(config.getBoolean("enabled"));
            }
            if (config.hasKey("hitSlop")) {
                INSTANCE.b(handler, config);
            }
            if (config.hasKey("needsPointerData")) {
                handler.C0(config.getBoolean("needsPointerData"));
            }
            if (config.hasKey("manualActivation")) {
                ((GestureHandler) handler).manualActivation = config.getBoolean("manualActivation");
            }
            if (config.hasKey("mouseButton")) {
                handler.B0(config.getInt("mouseButton"));
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.GestureHandler$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$c;", "", "", "pointerId", "", "x", "y", "absoluteX", "absoluteY", "<init>", "(IFFFF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "h", "(F)V", "e", IntegerTokenConverter.CONVERTER_KEY, "f", "g", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class PointerData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pointerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private float x;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private float y;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private float absoluteX;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private float absoluteY;

        public PointerData(int i11, float f11, float f12, float f13, float f14) {
            this.pointerId = i11;
            this.x = f11;
            this.y = f12;
            this.absoluteX = f13;
            this.absoluteY = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getAbsoluteX() {
            return this.absoluteX;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getAbsoluteY() {
            return this.absoluteY;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPointerId() {
            return this.pointerId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointerData)) {
                return false;
            }
            PointerData pointerData = (PointerData) other;
            return this.pointerId == pointerData.pointerId && Float.compare(this.x, pointerData.x) == 0 && Float.compare(this.y, pointerData.y) == 0 && Float.compare(this.absoluteX, pointerData.absoluteX) == 0 && Float.compare(this.absoluteY, pointerData.absoluteY) == 0;
        }

        public final void f(float f11) {
            this.absoluteX = f11;
        }

        public final void g(float f11) {
            this.absoluteY = f11;
        }

        public final void h(float f11) {
            this.x = f11;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.pointerId) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.absoluteX)) * 31) + Float.hashCode(this.absoluteY);
        }

        public final void i(float f11) {
            this.y = f11;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.pointerId + ", x=" + this.x + ", y=" + this.y + ", absoluteX=" + this.absoluteX + ", absoluteY=" + this.absoluteY + ")";
        }
    }

    public GestureHandler() {
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr[i11] = 0;
        }
        this.windowOffset = iArr;
        this.isEnabled = true;
        PointerData[] pointerDataArr = new PointerData[12];
        for (int i12 = 0; i12 < 12; i12++) {
            pointerDataArr[i12] = null;
        }
        this.trackedPointers = pointerDataArr;
        this.pointerType = 3;
    }

    private final void A(MotionEvent event, MotionEvent sourceEvent) {
        C();
        this.changedTouchesPayload = null;
        this.touchEventType = 3;
        int pointerId = event.getPointerId(event.getActionIndex());
        this.trackedPointers[pointerId] = new PointerData(pointerId, event.getX(event.getActionIndex()), event.getY(event.getActionIndex()), (sourceEvent.getX(event.getActionIndex()) + (sourceEvent.getRawX() - sourceEvent.getX())) - this.windowOffset[0], (sourceEvent.getY(event.getActionIndex()) + (sourceEvent.getRawY() - sourceEvent.getY())) - this.windowOffset[1]);
        PointerData pointerData = this.trackedPointers[pointerId];
        s.h(pointerData);
        n(pointerData);
        this.trackedPointers[pointerId] = null;
        this.trackedPointersCount--;
        y();
    }

    private final void C() {
        this.allTouchesPayload = null;
        for (PointerData pointerData : this.trackedPointers) {
            if (pointerData != null) {
                o(pointerData);
            }
        }
    }

    private final int E() {
        int[] iArr;
        int i11 = 0;
        while (i11 < this.trackedPointersIDsCount) {
            int i12 = 0;
            while (true) {
                iArr = this.trackedPointerIDs;
                if (i12 >= iArr.length || iArr[i12] == i11) {
                    break;
                }
                i12++;
            }
            if (i12 == iArr.length) {
                break;
            }
            i11++;
        }
        return i11;
    }

    private final void F0(MotionEvent event) {
        int toolType = event.getToolType(event.getActionIndex());
        int i11 = 1;
        if (toolType == 1) {
            i11 = 0;
        } else if (toolType != 2) {
            i11 = 3;
            if (toolType == 3) {
                i11 = 2;
            }
        }
        this.pointerType = i11;
    }

    private final Activity H(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return H(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(GestureHandler gestureHandler) {
        gestureHandler.q();
    }

    private final boolean b0(int clickedButton) {
        int i11 = this.mouseButton;
        if (i11 == 0) {
            return clickedButton == 1;
        }
        return (clickedButton & i11) != 0;
    }

    private final boolean e0(int pointerId) {
        return this.trackedPointerIDs[pointerId] != -1;
    }

    private final void h0(int newState) {
        UiThreadUtil.assertOnUiThread();
        if (this.state == newState) {
            return;
        }
        if (this.trackedPointersCount > 0 && (newState == 5 || newState == 3 || newState == 1)) {
            r();
        }
        int i11 = this.state;
        this.state = newState;
        if (newState == 4) {
            short s11 = N;
            N = (short) (s11 + 1);
            this.eventCoalescingKey = s11;
        }
        y90.g gVar = this.orchestrator;
        s.h(gVar);
        gVar.A(this, newState, i11);
        p0(newState, i11);
    }

    private final boolean i0(MotionEvent event) {
        if (event.getPointerCount() != this.trackedPointersIDsCount) {
            return true;
        }
        int length = this.trackedPointerIDs.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = this.trackedPointerIDs[i11];
            if (i12 != -1 && i12 != i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private final MotionEvent m(MotionEvent event) throws AdaptEventException {
        int actionIndex;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        if (!i0(event)) {
            return event;
        }
        int actionMasked = event.getActionMasked();
        int i11 = 2;
        int i12 = 0;
        if (actionMasked == 0) {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 0;
                } else {
                    i11 = 5;
                }
            }
        } else if (actionMasked == 1) {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 1;
                } else {
                    i11 = 6;
                }
            }
        } else if (actionMasked == 5) {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 0;
                } else {
                    i11 = 5;
                }
            }
        } else if (actionMasked != 6) {
            i11 = actionMasked;
            actionIndex = -1;
        } else {
            actionIndex = event.getActionIndex();
            if (this.trackedPointerIDs[event.getPointerId(actionIndex)] != -1) {
                if (this.trackedPointersIDsCount == 1) {
                    i11 = 1;
                } else {
                    i11 = 6;
                }
            }
        }
        INSTANCE.d(this.trackedPointersIDsCount);
        float rawX = event.getRawX() - event.getX();
        float rawY = event.getRawY() - event.getY();
        event.offsetLocation(rawX, rawY);
        int pointerCount = event.getPointerCount();
        int i13 = i11;
        int i14 = 0;
        while (true) {
            pointerPropertiesArr = null;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = null;
            if (i12 >= pointerCount) {
                break;
            }
            int pointerId = event.getPointerId(i12);
            if (this.trackedPointerIDs[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr3 = L;
                if (pointerPropertiesArr3 == null) {
                    s.B("pointerProps");
                    pointerPropertiesArr3 = null;
                }
                event.getPointerProperties(i12, pointerPropertiesArr3[i14]);
                MotionEvent.PointerProperties[] pointerPropertiesArr4 = L;
                if (pointerPropertiesArr4 == null) {
                    s.B("pointerProps");
                    pointerPropertiesArr4 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i14];
                s.h(pointerProperties);
                pointerProperties.id = this.trackedPointerIDs[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr3 = M;
                if (pointerCoordsArr3 == null) {
                    s.B("pointerCoords");
                } else {
                    pointerCoordsArr2 = pointerCoordsArr3;
                }
                event.getPointerCoords(i12, pointerCoordsArr2[i14]);
                if (i12 == actionIndex) {
                    i13 |= i14 << 8;
                }
                i14++;
            }
            i12++;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr5 = L;
        if (pointerPropertiesArr5 == null) {
            s.B("pointerProps");
            pointerPropertiesArr5 = null;
        }
        if (pointerPropertiesArr5.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr4 = M;
            if (pointerCoordsArr4 == null) {
                s.B("pointerCoords");
                pointerCoordsArr4 = null;
            }
            if (pointerCoordsArr4.length != 0) {
                try {
                    long downTime = event.getDownTime();
                    long eventTime = event.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr6 = L;
                    if (pointerPropertiesArr6 == null) {
                        s.B("pointerProps");
                        pointerPropertiesArr2 = null;
                    } else {
                        pointerPropertiesArr2 = pointerPropertiesArr6;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr5 = M;
                    if (pointerCoordsArr5 == null) {
                        s.B("pointerCoords");
                        pointerCoordsArr = null;
                    } else {
                        pointerCoordsArr = pointerCoordsArr5;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i13, i14, pointerPropertiesArr2, pointerCoordsArr, event.getMetaState(), event.getButtonState(), event.getXPrecision(), event.getYPrecision(), event.getDeviceId(), event.getEdgeFlags(), event.getSource(), event.getFlags());
                    float f11 = -rawX;
                    float f12 = -rawY;
                    event.offsetLocation(f11, f12);
                    motionEventObtain.offsetLocation(f11, f12);
                    return motionEventObtain;
                } catch (IllegalArgumentException e11) {
                    throw new AdaptEventException(this, event, e11);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr6 = M;
        if (pointerCoordsArr6 == null) {
            s.B("pointerCoords");
            pointerCoordsArr6 = null;
        }
        int length = pointerCoordsArr6.length;
        MotionEvent.PointerProperties[] pointerPropertiesArr7 = L;
        if (pointerPropertiesArr7 == null) {
            s.B("pointerProps");
        } else {
            pointerPropertiesArr = pointerPropertiesArr7;
        }
        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerPropertiesArr.length);
    }

    private final void n(PointerData pointerData) {
        if (this.changedTouchesPayload == null) {
            this.changedTouchesPayload = Arguments.createArray();
        }
        WritableArray writableArray = this.changedTouchesPayload;
        s.h(writableArray);
        writableArray.pushMap(u(pointerData));
    }

    private final void o(PointerData pointerData) {
        if (this.allTouchesPayload == null) {
            this.allTouchesPayload = Arguments.createArray();
        }
        WritableArray writableArray = this.allTouchesPayload;
        s.h(writableArray);
        writableArray.pushMap(u(pointerData));
    }

    private final void r() {
        this.touchEventType = 4;
        this.changedTouchesPayload = null;
        C();
        for (PointerData pointerData : this.trackedPointers) {
            if (pointerData != null) {
                n(pointerData);
            }
        }
        this.trackedPointersCount = 0;
        n.D(this.trackedPointers, null, 0, 0, 6, null);
        y();
    }

    private final WritableMap u(PointerData pointerData) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", pointerData.getPointerId());
        writableMapCreateMap.putDouble("x", w.f(pointerData.getX()));
        writableMapCreateMap.putDouble("y", w.f(pointerData.getY()));
        writableMapCreateMap.putDouble("absoluteX", w.f(pointerData.getAbsoluteX()));
        writableMapCreateMap.putDouble("absoluteY", w.f(pointerData.getAbsoluteY()));
        return writableMapCreateMap;
    }

    private final void x(MotionEvent event, MotionEvent sourceEvent) {
        this.changedTouchesPayload = null;
        this.touchEventType = 1;
        int pointerId = event.getPointerId(event.getActionIndex());
        this.trackedPointers[pointerId] = new PointerData(pointerId, event.getX(event.getActionIndex()), event.getY(event.getActionIndex()), (sourceEvent.getX(event.getActionIndex()) + (sourceEvent.getRawX() - sourceEvent.getX())) - this.windowOffset[0], (sourceEvent.getY(event.getActionIndex()) + (sourceEvent.getRawY() - sourceEvent.getY())) - this.windowOffset[1]);
        this.trackedPointersCount++;
        PointerData pointerData = this.trackedPointers[pointerId];
        s.h(pointerData);
        n(pointerData);
        C();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z11) {
        if (this.view != null && this.isEnabled != z11) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: y90.b
                @Override // java.lang.Runnable
                public final void run() {
                    GestureHandler.b(this.f125284a);
                }
            });
        }
        this.isEnabled = z11;
    }

    private final void z(MotionEvent event, MotionEvent sourceEvent) {
        this.changedTouchesPayload = null;
        this.touchEventType = 2;
        float rawX = sourceEvent.getRawX() - sourceEvent.getX();
        float rawY = sourceEvent.getRawY() - sourceEvent.getY();
        int pointerCount = event.getPointerCount();
        int i11 = 0;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            PointerData pointerData = this.trackedPointers[event.getPointerId(i12)];
            if (pointerData != null && (pointerData.getX() != event.getX(i12) || pointerData.getY() != event.getY(i12))) {
                pointerData.h(event.getX(i12));
                pointerData.i(event.getY(i12));
                pointerData.f((sourceEvent.getX(i12) + rawX) - this.windowOffset[0]);
                pointerData.g((sourceEvent.getY(i12) + rawY) - this.windowOffset[1]);
                n(pointerData);
                i11++;
            }
        }
        if (i11 > 0) {
            C();
            y();
        }
    }

    public final void A0(y90.c controller) {
        this.interactionController = controller;
    }

    public final void B() {
        int i11 = this.state;
        if (i11 == 2 || i11 == 4) {
            h0(5);
        }
    }

    protected final void B0(int i11) {
        this.mouseButton = i11;
    }

    public final void C0(boolean z11) {
        this.needsPointerData = z11;
    }

    public final void D() {
        int i11 = this.state;
        if (i11 == 4 || i11 == 0 || i11 == 2) {
            k0();
            h0(1);
        }
    }

    protected final void D0(int i11) {
        this.numberOfPointers = i11;
    }

    public final void E0(y90.l lVar) {
        this.onTouchEventListener = lVar;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int getActivationIndex() {
        return this.activationIndex;
    }

    protected final void G0(boolean z11) {
        this.shouldCancelWhenOutside = z11;
    }

    public final void H0(boolean z11) {
        this.shouldResetProgress = z11;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final short getEventCoalescingKey() {
        return this.eventCoalescingKey;
    }

    public final void I0(int i11) {
        this.tag = i11;
    }

    public final float J() {
        return (this.lastAbsolutePositionX + this.lastEventOffsetX) - this.windowOffset[0];
    }

    protected final boolean J0(MotionEvent sourceEvent) {
        s.k(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || b0(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !b0(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float K() {
        return (this.lastAbsolutePositionY + this.lastEventOffsetY) - this.windowOffset[1];
    }

    public boolean K0(GestureHandler handler) {
        y90.c cVar;
        s.k(handler, "handler");
        if (handler == this || (cVar = this.interactionController) == null) {
            return false;
        }
        return cVar.d(this, handler);
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final float getLastAbsolutePositionX() {
        return this.lastAbsolutePositionX;
    }

    public boolean L0(GestureHandler handler) {
        s.k(handler, "handler");
        if (handler == this) {
            return true;
        }
        y90.c cVar = this.interactionController;
        if (cVar != null) {
            return cVar.c(this, handler);
        }
        return false;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final float getLastAbsolutePositionY() {
        return this.lastAbsolutePositionY;
    }

    public boolean M0(GestureHandler handler) {
        y90.c cVar;
        s.k(handler, "handler");
        if (handler == this || (cVar = this.interactionController) == null) {
            return false;
        }
        return cVar.b(this, handler);
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final boolean getNeedsPointerData() {
        return this.needsPointerData;
    }

    public final boolean N0(GestureHandler handler) {
        y90.c cVar;
        s.k(handler, "handler");
        if (handler == this || (cVar = this.interactionController) == null) {
            return false;
        }
        return cVar.a(this, handler);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getNumberOfPointers() {
        return this.numberOfPointers;
    }

    public final void O0(int pointerId) {
        if (e0(pointerId)) {
            return;
        }
        this.trackedPointerIDs[pointerId] = E();
        this.trackedPointersIDsCount++;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    protected final y90.g getOrchestrator() {
        return this.orchestrator;
    }

    public final void P0(int pointerId) {
        if (e0(pointerId)) {
            this.trackedPointerIDs[pointerId] = -1;
            this.trackedPointersIDsCount--;
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final int getPointerType() {
        return this.pointerType;
    }

    protected final PointF Q0(PointF point) {
        PointF pointFK;
        s.k(point, "point");
        y90.g gVar = this.orchestrator;
        if (gVar != null && (pointFK = gVar.K(this.view, point)) != null) {
            return pointFK;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getShouldResetProgress() {
        return this.shouldResetProgress;
    }

    public final void R0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            x(event, sourceEvent);
            z(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            z(event, sourceEvent);
            A(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            z(event, sourceEvent);
        }
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final boolean S0(MotionEvent event) {
        int i11;
        s.k(event, "event");
        return (!this.isEnabled || (i11 = this.state) == 1 || i11 == 3 || i11 == 5 || !e0(event.getPointerId(event.getActionIndex()))) ? false : true;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    public final void T0(wn0.a<h0> closure) {
        s.k(closure, "closure");
        this.isWithinBounds = true;
        closure.invoke();
        this.isWithinBounds = false;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final int getTouchEventType() {
        return this.touchEventType;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final int getTrackedPointersCount() {
        return this.trackedPointersCount;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final void X(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i11;
        s.k(transformedEvent, "transformedEvent");
        s.k(sourceEvent, "sourceEvent");
        if (!this.isEnabled || (i11 = this.state) == 3 || i11 == 1 || i11 == 5 || this.trackedPointersIDsCount < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {m(transformedEvent), m(sourceEvent)};
            MotionEvent motionEvent = motionEventArr[0];
            MotionEvent motionEvent2 = motionEventArr[1];
            this.x = motionEvent.getX();
            this.y = motionEvent.getY();
            this.numberOfPointers = motionEvent.getPointerCount();
            boolean zG0 = g0(this.view, this.x, this.y);
            this.isWithinBounds = zG0;
            if (this.shouldCancelWhenOutside && !zG0) {
                int i12 = this.state;
                if (i12 == 4) {
                    q();
                    return;
                } else {
                    if (i12 == 2) {
                        D();
                        return;
                    }
                    return;
                }
            }
            y90.i iVar = y90.i.f125305a;
            this.lastAbsolutePositionX = iVar.b(motionEvent, true);
            this.lastAbsolutePositionY = iVar.c(motionEvent, true);
            this.lastEventOffsetX = motionEvent.getRawX() - motionEvent.getX();
            this.lastEventOffsetY = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                F0(sourceEvent);
            }
            if (sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7 || sourceEvent.getAction() == 10) {
                m0(motionEvent, motionEvent2);
            } else {
                l0(motionEvent, motionEvent2);
            }
            if (!s.f(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (s.f(motionEvent2, sourceEvent)) {
                return;
            }
            motionEvent2.recycle();
        } catch (AdaptEventException unused) {
            D();
        }
    }

    public final boolean Y(GestureHandler other) {
        s.k(other, "other");
        int length = this.trackedPointerIDs.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.trackedPointerIDs[i11] != -1 && other.trackedPointerIDs[i11] != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final boolean getIsAwaiting() {
        return this.isAwaiting;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(com.swmansion.gesturehandler.core.GestureHandler r4) {
        /*
            r3 = this;
            java.lang.String r0 = "of"
            p013kotlin.jvm.internal.s.k(r4, r0)
            android.view.View r0 = r3.view
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r0.getParent()
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L2f
            android.view.View r2 = r4.view
            boolean r2 = p013kotlin.jvm.internal.s.f(r0, r2)
            if (r2 == 0) goto L24
            r4 = 1
            return r4
        L24:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L2f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.GestureHandler.c0(com.swmansion.gesturehandler.core.GestureHandler):boolean");
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final boolean getIsWithinBounds() {
        return this.isWithinBounds;
    }

    public final boolean g0(View view, float posX, float posY) {
        float f11;
        x90.g.Companion companion = x90.g.INSTANCE;
        s.h(view);
        if (companion.e(view)) {
            return companion.c(view, posX, posY);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.hitSlop;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            Companion companion2 = INSTANCE;
            float f17 = companion2.c(f13) ? BitmapDescriptorFactory.HUE_RED - f13 : 0.0f;
            if (companion2.c(f14)) {
                f12 = BitmapDescriptorFactory.HUE_RED - f14;
            }
            if (companion2.c(f15)) {
                width += f15;
            }
            if (companion2.c(f16)) {
                height += f16;
            }
            float f18 = fArr[4];
            float f19 = fArr[5];
            if (companion2.c(f18)) {
                if (!companion2.c(f13)) {
                    f17 = width - f18;
                } else if (!companion2.c(f15)) {
                    width = f18 + f17;
                }
            }
            if (companion2.c(f19)) {
                if (!companion2.c(f14)) {
                    f12 = height - f19;
                } else if (!companion2.c(f16)) {
                    height = f19 + f12;
                }
            }
            f11 = f12;
            f12 = f17;
        } else {
            f11 = 0.0f;
        }
        return f12 <= posX && posX <= width && f11 <= posY && posY <= height;
    }

    protected void j0() {
    }

    public final void k() {
        l(false);
    }

    protected void k0() {
    }

    public void l(boolean force) {
        if (!this.manualActivation || force) {
            int i11 = this.state;
            if (i11 == 0 || i11 == 2) {
                h0(4);
            }
        }
    }

    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        h0(1);
    }

    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
    }

    protected void n0() {
    }

    protected void o0() {
    }

    public final void p() {
        if (this.state == 0) {
            h0(2);
        }
    }

    protected void p0(int newState, int previousState) {
    }

    public final void q() {
        int i11 = this.state;
        if (i11 == 4 || i11 == 0 || i11 == 2 || this.isAwaiting) {
            j0();
            h0(3);
        }
    }

    public final void q0(View view, y90.g orchestrator) {
        if (this.view != null || this.orchestrator != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.trackedPointerIDs, -1);
        this.trackedPointersIDsCount = 0;
        this.state = 0;
        this.view = view;
        this.orchestrator = orchestrator;
        Activity activityH = H(view != null ? view.getContext() : null);
        View viewFindViewById = activityH != null ? activityH.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.windowOffset);
        } else {
            int[] iArr = this.windowOffset;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        n0();
    }

    public final void r0() {
        this.view = null;
        this.orchestrator = null;
        Arrays.fill(this.trackedPointerIDs, -1);
        this.trackedPointersIDsCount = 0;
        this.trackedPointersCount = 0;
        n.D(this.trackedPointers, null, 0, 0, 6, null);
        this.touchEventType = 0;
        o0();
    }

    public final WritableArray s() {
        WritableArray writableArray = this.allTouchesPayload;
        this.allTouchesPayload = null;
        return writableArray;
    }

    public void s0() {
        this.needsPointerData = false;
        this.manualActivation = false;
        this.shouldCancelWhenOutside = false;
        y0(true);
        this.hitSlop = (float[]) K;
        this.mouseButton = 0;
    }

    public final WritableArray t() {
        WritableArray writableArray = this.changedTouchesPayload;
        this.changedTouchesPayload = null;
        return writableArray;
    }

    public void t0() {
    }

    public String toString() {
        String simpleName;
        View view = this.view;
        if (view == null) {
            simpleName = null;
        } else {
            s.h(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.tag + "]:" + simpleName;
    }

    public final void u0(int i11) {
        this.actionType = i11;
    }

    public void v(MotionEvent event) {
        s.k(event, "event");
        y90.l lVar = this.onTouchEventListener;
        if (lVar != null) {
            lVar.c(this, event);
        }
    }

    public final void v0(int i11) {
        this.activationIndex = i11;
    }

    public void w(int newState, int prevState) {
        y90.l lVar = this.onTouchEventListener;
        if (lVar != null) {
            lVar.a(this, newState, prevState);
        }
    }

    public final void w0(boolean z11) {
        this.isActive = z11;
    }

    public final void x0(boolean z11) {
        this.isAwaiting = z11;
    }

    public void y() {
        y90.l lVar;
        if (this.changedTouchesPayload == null || (lVar = this.onTouchEventListener) == null) {
            return;
        }
        lVar.b(this);
    }

    public final void z0(float leftPad, float topPad, float rightPad, float bottomPad, float width, float height) {
        if (this.hitSlop == null) {
            this.hitSlop = new float[6];
        }
        float[] fArr = this.hitSlop;
        s.h(fArr);
        fArr[0] = leftPad;
        float[] fArr2 = this.hitSlop;
        s.h(fArr2);
        fArr2[1] = topPad;
        float[] fArr3 = this.hitSlop;
        s.h(fArr3);
        fArr3[2] = rightPad;
        float[] fArr4 = this.hitSlop;
        s.h(fArr4);
        fArr4[3] = bottomPad;
        float[] fArr5 = this.hitSlop;
        s.h(fArr5);
        fArr5[4] = width;
        float[] fArr6 = this.hitSlop;
        s.h(fArr6);
        fArr6[5] = height;
        Companion companion = INSTANCE;
        if (companion.c(width) && companion.c(leftPad) && companion.c(rightPad)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (companion.c(width) && !companion.c(leftPad) && !companion.c(rightPad)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (companion.c(height) && companion.c(bottomPad) && companion.c(topPad)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (companion.c(height) && !companion.c(bottomPad) && !companion.c(topPad)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }
}
