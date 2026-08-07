package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.Scopes;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0003\b\u008b\u0001\b\u0081\b\u0018\u0000 Ý\u00012\u00020\u0001:\f]Þ\u0001Mß\u0001à\u0001á\u0001â\u0001B\u0081\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>BÇ\u0004\b\u0011\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010A\u001a\u00020?\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0001\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010(\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010*\u0012\u0016\b\u0001\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010!\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u000103\u0012\u0016\b\u0001\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b=\u0010DJ(\u0010K\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HHÁ\u0001¢\u0006\u0004\bK\u0010LJª\u0004\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020?HÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010U\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020?HÖ\u0001¢\u0006\u0004\bW\u0010RJ \u0010[\u001a\u00020J2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020?HÖ\u0001¢\u0006\u0004\b[\u0010\\R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010^\u0012\u0004\bd\u0010b\u001a\u0004\bc\u0010`R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\be\u0010^\u0012\u0004\bg\u0010b\u001a\u0004\bf\u0010`R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bh\u0010^\u0012\u0004\bj\u0010b\u001a\u0004\bi\u0010`R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bk\u0010l\u0012\u0004\bn\u0010b\u001a\u0004\bm\u0010PR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bo\u0010^\u0012\u0004\bq\u0010b\u001a\u0004\bp\u0010`R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\br\u0010^\u0012\u0004\bt\u0010b\u001a\u0004\bs\u0010`R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bu\u0010^\u0012\u0004\bw\u0010b\u001a\u0004\bv\u0010`R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bx\u0010^\u0012\u0004\bz\u0010b\u001a\u0004\by\u0010`R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b_\u0010^\u0012\u0004\b|\u0010b\u001a\u0004\b{\u0010`R\"\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b}\u0010~\u0012\u0005\b\u0081\u0001\u0010b\u001a\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u0010b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0005\b\u008b\u0001\u0010b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R%\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u0012\u0005\b\u0090\u0001\u0010b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R#\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010^\u0012\u0005\b\u0093\u0001\u0010b\u001a\u0005\b\u0092\u0001\u0010`R#\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010^\u0012\u0005\b\u0096\u0001\u0010b\u001a\u0005\b\u0095\u0001\u0010`R'\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u0012\u0005\b\u009b\u0001\u0010b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R#\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\bi\u0010l\u0012\u0005\b\u009c\u0001\u0010b\u001a\u0004\bh\u0010PR&\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u0012\u0005\b \u0001\u0010b\u001a\u0005\bk\u0010\u009f\u0001R$\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b¡\u0001\u0010l\u0012\u0005\b¢\u0001\u0010b\u001a\u0004\bo\u0010PR$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b£\u0001\u0010l\u0012\u0005\b¤\u0001\u0010b\u001a\u0004\br\u0010PR&\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0006\b¥\u0001\u0010¦\u0001\u0012\u0005\b¨\u0001\u0010b\u001a\u0005\bu\u0010§\u0001R&\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0016\n\u0006\b©\u0001\u0010ª\u0001\u0012\u0005\b¬\u0001\u0010b\u001a\u0005\bx\u0010«\u0001R$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b\u00ad\u0001\u0010l\u0012\u0005\b®\u0001\u0010b\u001a\u0004\b}\u0010PR$\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bs\u0010l\u0012\u0005\b¯\u0001\u0010b\u001a\u0005\b\u0082\u0001\u0010PR$\u0010%\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bv\u0010l\u0012\u0005\b°\u0001\u0010b\u001a\u0005\b\u0087\u0001\u0010PR%\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010l\u0012\u0005\b±\u0001\u0010b\u001a\u0005\b\u0097\u0001\u0010PR%\u0010'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b²\u0001\u0010l\u0012\u0005\b´\u0001\u0010b\u001a\u0005\b³\u0001\u0010PR3\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bµ\u0001\u0010¶\u0001\u0012\u0005\b¸\u0001\u0010b\u001a\u0006\b£\u0001\u0010·\u0001R&\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\by\u0010¹\u0001\u0012\u0005\b»\u0001\u0010b\u001a\u0006\b\u009d\u0001\u0010º\u0001R2\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u007f\u0010¶\u0001\u0012\u0005\b¼\u0001\u0010b\u001a\u0006\b¥\u0001\u0010·\u0001R%\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b½\u0001\u0010l\u0012\u0005\b¾\u0001\u0010b\u001a\u0005\b©\u0001\u0010PR'\u0010.\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010ª\u0001\u0012\u0005\b¿\u0001\u0010b\u001a\u0006\b\u00ad\u0001\u0010«\u0001R&\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0006\bÀ\u0001\u0010\u009e\u0001\u0012\u0005\bÁ\u0001\u0010b\u001a\u0005\b/\u0010\u009f\u0001R'\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÂ\u0001\u0010\u009e\u0001\u0012\u0005\bÄ\u0001\u0010b\u001a\u0006\bÃ\u0001\u0010\u009f\u0001R'\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÅ\u0001\u0010\u009e\u0001\u0012\u0005\bÇ\u0001\u0010b\u001a\u0006\bÆ\u0001\u0010\u009f\u0001R'\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u009e\u0001\u0012\u0005\bÉ\u0001\u0010b\u001a\u0006\bÈ\u0001\u0010\u009f\u0001R'\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÊ\u0001\u0010Ë\u0001\u0012\u0005\bÎ\u0001\u0010b\u001a\u0006\bÌ\u0001\u0010Í\u0001R3\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÏ\u0001\u0010¶\u0001\u0012\u0005\bÑ\u0001\u0010b\u001a\u0006\bÐ\u0001\u0010·\u0001R'\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÒ\u0001\u0010Ó\u0001\u0012\u0005\bÕ\u0001\u0010b\u001a\u0006\b½\u0001\u0010Ô\u0001R'\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÃ\u0001\u0010\u009e\u0001\u0012\u0005\b×\u0001\u0010b\u001a\u0006\bÖ\u0001\u0010\u009f\u0001R%\u00109\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bÆ\u0001\u0010l\u0012\u0005\bØ\u0001\u0010b\u001a\u0005\bÏ\u0001\u0010PR'\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÈ\u0001\u0010\u009e\u0001\u0012\u0005\bÙ\u0001\u0010b\u001a\u0006\bÊ\u0001\u0010\u009f\u0001R&\u0010<\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bK\u0010Ú\u0001\u0012\u0005\bÜ\u0001\u0010b\u001a\u0006\bÒ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Landroid/os/Parcelable;", "", "allowManualEntry", "consentRequired", "customManualEntryHandling", "disableLinkMoreAccounts", "", "id", "instantVerificationDisabled", "institutionSearchDisabled", "livemode", "manualEntryUsesMicrodeposits", "mobileHandoffEnabled", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "manualEntryMode", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "permissions", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "product", "singleAccount", "useSingleSortSearch", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "accountDisconnectionMethod", "accountholderCustomerEmailAddress", "accountholderIsLinkConsumer", "accountholderPhoneNumber", "accountholderToken", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "activeAuthSession", "Lcom/stripe/android/financialconnections/model/q;", "activeInstitution", "assignmentEventId", "businessName", "cancelUrl", "connectPlatformName", "connectedAccountName", "", "experimentAssignments", "Lcom/stripe/android/financialconnections/model/l0;", "displayText", AnalyticsContext.Features, "hostedAuthUrl", "initialInstitution", "isEndUserFacing", "isLinkWithStripe", "isNetworkingUserFlow", "isStripeDirect", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "linkAccountSessionCancellationBehavior", "modalCustomization", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", Action.PAYMENT_METHOD_TYPE, "stepUpAuthenticationRequired", "successUrl", "skipSuccessPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "theme", "<init>", "(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/l0;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)V", "", "seen1", "seen2", "Lvo0/v1;", "serializationConstructorMarker", "(IIZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/l0;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "R", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Luo0/d;Lto0/f;)V", "b", "(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/l0;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "j", "()Z", "getAllowManualEntry$annotations", "()V", "getConsentRequired", "getConsentRequired$annotations", "c", "getCustomManualEntryHandling", "getCustomManualEntryHandling$annotations", DateTokenConverter.CONVERTER_KEY, "r", "getDisableLinkMoreAccounts$annotations", "e", "Ljava/lang/String;", "getId", "getId$annotations", "f", "getInstantVerificationDisabled", "getInstantVerificationDisabled$annotations", "g", "y", "getInstitutionSearchDisabled$annotations", "h", "z", "getLivemode$annotations", IntegerTokenConverter.CONVERTER_KEY, "D", "getManualEntryUsesMicrodeposits$annotations", "getMobileHandoffEnabled", "getMobileHandoffEnabled$annotations", "k", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "E", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "l", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "A", "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "getManualEntryMode$annotations", "m", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "getPermissions$annotations", "n", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "G", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "getProduct$annotations", "o", "K", "getSingleAccount$annotations", "p", "getUseSingleSortSearch", "getUseSingleSortSearch$annotations", "q", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "getAccountDisconnectionMethod", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "getAccountDisconnectionMethod$annotations", "getAccountholderCustomerEmailAddress$annotations", "s", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getAccountholderIsLinkConsumer$annotations", "t", "getAccountholderPhoneNumber$annotations", "u", "getAccountholderToken$annotations", "v", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "getActiveAuthSession$annotations", "w", "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "getActiveInstitution$annotations", "x", "getAssignmentEventId$annotations", "getBusinessName$annotations", "getCancelUrl$annotations", "getConnectPlatformName$annotations", "B", "getConnectedAccountName", "getConnectedAccountName$annotations", "C", "Ljava/util/Map;", "()Ljava/util/Map;", "getExperimentAssignments$annotations", "Lcom/stripe/android/financialconnections/model/l0;", "()Lcom/stripe/android/financialconnections/model/l0;", "getDisplayText$annotations", "getFeatures$annotations", Gender.FEMALE, "getHostedAuthUrl$annotations", "getInitialInstitution$annotations", "H", "isEndUserFacing$annotations", "I", Gender.OTHER, "isLinkWithStripe$annotations", "J", "P", "isNetworkingUserFlow$annotations", "Q", "isStripeDirect$annotations", "L", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "getLinkAccountSessionCancellationBehavior", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "getLinkAccountSessionCancellationBehavior$annotations", Gender.MALE, "getModalCustomization", "getModalCustomization$annotations", Gender.NONE, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "getPaymentMethodType$annotations", "getStepUpAuthenticationRequired", "getStepUpAuthenticationRequired$annotations", "getSuccessUrl$annotations", "getSkipSuccessPane$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "getTheme$annotations", "Companion", "AccountDisconnectionMethod", "LinkAccountSessionCancellationBehavior", "Pane", "Product", "Theme", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class FinancialConnectionsSessionManifest implements Parcelable {
    private static final ro0.d<Object>[] T;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final String connectPlatformName;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final String connectedAccountName;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final Map<String, String> experimentAssignments;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final TextUpdate displayText;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private final Map<String, Boolean> features;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private final String hostedAuthUrl;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    private final FinancialConnectionsInstitution initialInstitution;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    private final Boolean isEndUserFacing;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
    private final Boolean isLinkWithStripe;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
    private final Boolean isNetworkingUserFlow;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
    private final Boolean isStripeDirect;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
    private final LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
    private final Map<String, Boolean> modalCustomization;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
    private final FinancialConnectionsAccount.SupportedPaymentMethodTypes paymentMethodType;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
    private final Boolean stepUpAuthenticationRequired;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
    private final String successUrl;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
    private final Boolean skipSuccessPane;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
    private final Theme theme;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowManualEntry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean consentRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean customManualEntryHandling;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean disableLinkMoreAccounts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean instantVerificationDisabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean institutionSearchDisabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean livemode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean manualEntryUsesMicrodeposits;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mobileHandoffEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pane nextPane;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ManualEntryMode manualEntryMode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FinancialConnectionsAccount.Permissions> permissions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Product product;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleAccount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useSingleSortSearch;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccountDisconnectionMethod accountDisconnectionMethod;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountholderCustomerEmailAddress;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean accountholderIsLinkConsumer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountholderPhoneNumber;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountholderToken;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsAuthorizationSession activeAuthSession;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsInstitution activeInstitution;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String assignmentEventId;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String businessName;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cancelUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int S = 8;
    public static final Parcelable.Creator<FinancialConnectionsSessionManifest> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "DASHBOARD", "EMAIL", "SUPPORT", "LINK", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum AccountDisconnectionMethod {
        DASHBOARD("dashboard"),
        EMAIL(Scopes.EMAIL),
        SUPPORT("support"),
        LINK("link"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50355c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50355c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50356e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$AccountDisconnectionMethod$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) AccountDisconnectionMethod.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<AccountDisconnectionMethod> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<AccountDisconnectionMethod> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50356e = new c();

            private c() {
                super((Enum[]) AccountDisconnectionMethod.getEntries().toArray(new AccountDisconnectionMethod[0]), AccountDisconnectionMethod.UNKNOWN);
            }
        }

        AccountDisconnectionMethod(String str) {
            this.value = str;
        }

        public static EnumEntries<AccountDisconnectionMethod> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "SILENT_SUCCESS", "USER_ERROR", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum LinkAccountSessionCancellationBehavior {
        SILENT_SUCCESS("treat_as_silent_success"),
        USER_ERROR("treat_as_user_error"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50357c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50357c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50358e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) LinkAccountSessionCancellationBehavior.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<LinkAccountSessionCancellationBehavior> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<LinkAccountSessionCancellationBehavior> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50358e = new c();

            private c() {
                super((Enum[]) LinkAccountSessionCancellationBehavior.getEntries().toArray(new LinkAccountSessionCancellationBehavior[0]), LinkAccountSessionCancellationBehavior.UNKNOWN);
            }
        }

        LinkAccountSessionCancellationBehavior(String str) {
            this.value = str;
        }

        public static EnumEntries<LinkAccountSessionCancellationBehavior> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "ACCOUNT_PICKER", "ATTACH_LINKED_PAYMENT_ACCOUNT", "AUTH_OPTIONS", "CONSENT", "BANK_AUTH_REPAIR", "INSTITUTION_PICKER", "LINK_CONSENT", "LINK_LOGIN", "MANUAL_ENTRY", "MANUAL_ENTRY_SUCCESS", "NETWORKING_LINK_LOGIN_WARMUP", "NETWORKING_LINK_SIGNUP_PANE", "NETWORKING_LINK_VERIFICATION", "LINK_STEP_UP_VERIFICATION", "PARTNER_AUTH", "SUCCESS", "UNEXPECTED_ERROR", "LINK_ACCOUNT_PICKER", "PARTNER_AUTH_DRAWER", "NETWORKING_SAVE_TO_LINK_VERIFICATION", "NOTICE", "RESET", "ACCOUNT_UPDATE_REQUIRED", "EXIT", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Pane {
        ACCOUNT_PICKER("account_picker"),
        ATTACH_LINKED_PAYMENT_ACCOUNT("attach_linked_payment_account"),
        AUTH_OPTIONS("auth_options"),
        CONSENT("consent"),
        BANK_AUTH_REPAIR("bank_auth_repair"),
        INSTITUTION_PICKER("institution_picker"),
        LINK_CONSENT("link_consent"),
        LINK_LOGIN("link_login"),
        MANUAL_ENTRY("manual_entry"),
        MANUAL_ENTRY_SUCCESS("manual_entry_success"),
        NETWORKING_LINK_LOGIN_WARMUP("networking_link_login_warmup"),
        NETWORKING_LINK_SIGNUP_PANE("networking_link_signup_pane"),
        NETWORKING_LINK_VERIFICATION("networking_link_verification"),
        LINK_STEP_UP_VERIFICATION("networking_link_step_up_verification"),
        PARTNER_AUTH("partner_auth"),
        SUCCESS("success"),
        UNEXPECTED_ERROR("unexpected_error"),
        LINK_ACCOUNT_PICKER("link_account_picker"),
        PARTNER_AUTH_DRAWER("partner_auth_drawer"),
        NETWORKING_SAVE_TO_LINK_VERIFICATION("networking_save_to_link_verification"),
        NOTICE("notice"),
        RESET("reset"),
        ACCOUNT_UPDATE_REQUIRED("account_update_required"),
        EXIT("exit");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50359c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50359c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50360e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$Pane$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Pane.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Pane> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Pane> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50360e = new c();

            private c() {
                super((Enum[]) Pane.getEntries().toArray(new Pane[0]), Pane.UNEXPECTED_ERROR);
            }
        }

        Pane(String str) {
            this.value = str;
        }

        public static EnumEntries<Pane> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "BILLPAY", "CANARY", "CAPITAL", "CAPITAL_HOSTED", "DASHBOARD", "DIRECT_ONBOARDING", "DIRECT_SETTINGS", "EMERALD", "EXPRESS_ONBOARDING", "EXTERNAL_API", "INSTANT_DEBITS", "ISSUING", "LCPM", "LINK_WITH_NETWORKING", "OPAL", "PAYMENT_FLOWS", "RESERVE_APPEALS", "STANDARD_ONBOARDING", "STRIPE_CARD", "SUPPORT_SITE", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Product {
        BILLPAY("billpay"),
        CANARY("canary"),
        CAPITAL("capital"),
        CAPITAL_HOSTED("capital_hosted"),
        DASHBOARD("dashboard"),
        DIRECT_ONBOARDING("direct_onboarding"),
        DIRECT_SETTINGS("direct_settings"),
        EMERALD("emerald"),
        EXPRESS_ONBOARDING("express_onboarding"),
        EXTERNAL_API("external_api"),
        INSTANT_DEBITS("instant_debits"),
        ISSUING("issuing"),
        LCPM("lcpm"),
        LINK_WITH_NETWORKING("link_with_networking"),
        OPAL("opal"),
        PAYMENT_FLOWS("payment_flows"),
        RESERVE_APPEALS("reserve_appeals"),
        STANDARD_ONBOARDING("standard_onboarding"),
        STRIPE_CARD("stripe_card"),
        SUPPORT_SITE("support_site"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50361c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50361c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50362e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$Product$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Product.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Product> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Product> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50362e = new c();

            private c() {
                super((Enum[]) Product.getEntries().toArray(new Product[0]), Product.UNKNOWN);
            }
        }

        Product(String str) {
            this.value = str;
        }

        public static EnumEntries<Product> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "b", "c", "LIGHT", "DASHBOARD_LIGHT", "LINK_LIGHT", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Theme {
        LIGHT,
        DASHBOARD_LIGHT,
        LINK_LIGHT;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50363c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50363c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50364e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$Theme$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Theme.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Theme> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Theme> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50364e = new c();

            private c() {
                super((Enum[]) Theme.getEntries().toArray(new Theme[0]), Theme.LIGHT);
            }
        }

        public static EnumEntries<Theme> getEntries() {
            return $ENTRIES;
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<FinancialConnectionsSessionManifest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50365a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50365a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest", aVar, 44);
            m1Var.o("allow_manual_entry", false);
            m1Var.o("consent_required", false);
            m1Var.o("custom_manual_entry_handling", false);
            m1Var.o("disable_link_more_accounts", false);
            m1Var.o("id", false);
            m1Var.o("instant_verification_disabled", false);
            m1Var.o("institution_search_disabled", false);
            m1Var.o("livemode", false);
            m1Var.o("manual_entry_uses_microdeposits", false);
            m1Var.o("mobile_handoff_enabled", false);
            m1Var.o("next_pane", false);
            m1Var.o("manual_entry_mode", false);
            m1Var.o("permissions", false);
            m1Var.o("product", false);
            m1Var.o("single_account", false);
            m1Var.o("use_single_sort_search", false);
            m1Var.o("account_disconnection_method", true);
            m1Var.o("accountholder_customer_email_address", true);
            m1Var.o("accountholder_is_link_consumer", true);
            m1Var.o("accountholder_phone_number", true);
            m1Var.o("accountholder_token", true);
            m1Var.o("active_auth_session", true);
            m1Var.o("active_institution", true);
            m1Var.o("assignment_event_id", true);
            m1Var.o("business_name", true);
            m1Var.o("cancel_url", true);
            m1Var.o("connect_platform_name", true);
            m1Var.o("connected_account_name", true);
            m1Var.o("experiment_assignments", true);
            m1Var.o("display_text", true);
            m1Var.o(AnalyticsContext.Features, true);
            m1Var.o("hosted_auth_url", true);
            m1Var.o("initial_institution", true);
            m1Var.o("is_end_user_facing", true);
            m1Var.o("is_link_with_stripe", true);
            m1Var.o("is_networking_user_flow", true);
            m1Var.o("is_stripe_direct", true);
            m1Var.o("link_account_session_cancellation_behavior", true);
            m1Var.o("modal_customization", true);
            m1Var.o("payment_method_type", true);
            m1Var.o("step_up_authentication_required", true);
            m1Var.o("success_url", true);
            m1Var.o("skip_success_pane", true);
            m1Var.o("theme", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FinancialConnectionsSessionManifest deserialize(uo0.e decoder) {
            AccountDisconnectionMethod accountDisconnectionMethod;
            int i11;
            Pane pane;
            Boolean bool;
            Boolean bool2;
            FinancialConnectionsInstitution qVar;
            TextUpdate l0Var;
            Theme theme;
            String str;
            Boolean bool3;
            LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Map map;
            Map map2;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            FinancialConnectionsInstitution qVar2;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            String str7;
            String str8;
            Map map3;
            String str9;
            Boolean bool7;
            String str10;
            List list;
            String str11;
            boolean z11;
            ManualEntryMode manualEntryMode;
            boolean z12;
            boolean z13;
            Product product;
            int i12;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes;
            boolean z21;
            boolean z22;
            int i13;
            int i14;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = FinancialConnectionsSessionManifest.T;
            if (cVarB.i()) {
                boolean zW = cVarB.w(descriptor2, 0);
                boolean zW2 = cVarB.w(descriptor2, 1);
                boolean zW3 = cVarB.w(descriptor2, 2);
                boolean zW4 = cVarB.w(descriptor2, 3);
                String strT = cVarB.t(descriptor2, 4);
                boolean zW5 = cVarB.w(descriptor2, 5);
                boolean zW6 = cVarB.w(descriptor2, 6);
                boolean zW7 = cVarB.w(descriptor2, 7);
                boolean zW8 = cVarB.w(descriptor2, 8);
                boolean zW9 = cVarB.w(descriptor2, 9);
                Pane pane2 = (Pane) cVarB.n(descriptor2, 10, Pane.c.f50360e, null);
                ManualEntryMode manualEntryMode2 = (ManualEntryMode) cVarB.n(descriptor2, 11, ManualEntryMode.c.f50375e, null);
                List list2 = (List) cVarB.n(descriptor2, 12, dVarArr[12], null);
                Product product2 = (Product) cVarB.n(descriptor2, 13, Product.c.f50362e, null);
                boolean zW10 = cVarB.w(descriptor2, 14);
                boolean zW11 = cVarB.w(descriptor2, 15);
                AccountDisconnectionMethod accountDisconnectionMethod2 = (AccountDisconnectionMethod) cVarB.v(descriptor2, 16, AccountDisconnectionMethod.c.f50356e, null);
                z1 z1Var = z1.f119730a;
                accountDisconnectionMethod = accountDisconnectionMethod2;
                String str12 = (String) cVarB.v(descriptor2, 17, z1Var, null);
                vo0.h hVar = vo0.h.f119620a;
                Boolean bool8 = (Boolean) cVarB.v(descriptor2, 18, hVar, null);
                String str13 = (String) cVarB.v(descriptor2, 19, z1Var, null);
                String str14 = (String) cVarB.v(descriptor2, 20, z1Var, null);
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) cVarB.v(descriptor2, 21, FinancialConnectionsAuthorizationSession.a.f50307a, null);
                FinancialConnectionsInstitution.a aVar = FinancialConnectionsInstitution.a.f50550a;
                FinancialConnectionsInstitution qVar3 = (FinancialConnectionsInstitution) cVarB.v(descriptor2, 22, aVar, null);
                String str15 = (String) cVarB.v(descriptor2, 23, z1Var, null);
                String str16 = (String) cVarB.v(descriptor2, 24, z1Var, null);
                String str17 = (String) cVarB.v(descriptor2, 25, z1Var, null);
                String str18 = (String) cVarB.v(descriptor2, 26, z1Var, null);
                String str19 = (String) cVarB.v(descriptor2, 27, z1Var, null);
                Map map4 = (Map) cVarB.v(descriptor2, 28, dVarArr[28], null);
                TextUpdate l0Var2 = (TextUpdate) cVarB.v(descriptor2, 29, TextUpdate.a.f50516a, null);
                Map map5 = (Map) cVarB.v(descriptor2, 30, dVarArr[30], null);
                String str20 = (String) cVarB.v(descriptor2, 31, z1Var, null);
                FinancialConnectionsInstitution qVar4 = (FinancialConnectionsInstitution) cVarB.v(descriptor2, 32, aVar, null);
                Boolean bool9 = (Boolean) cVarB.v(descriptor2, 33, hVar, null);
                Boolean bool10 = (Boolean) cVarB.v(descriptor2, 34, hVar, null);
                Boolean bool11 = (Boolean) cVarB.v(descriptor2, 35, hVar, null);
                Boolean bool12 = (Boolean) cVarB.v(descriptor2, 36, hVar, null);
                LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior2 = (LinkAccountSessionCancellationBehavior) cVarB.v(descriptor2, 37, LinkAccountSessionCancellationBehavior.c.f50358e, null);
                Map map6 = (Map) cVarB.v(descriptor2, 38, dVarArr[38], null);
                FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes2 = (FinancialConnectionsAccount.SupportedPaymentMethodTypes) cVarB.v(descriptor2, 39, FinancialConnectionsAccount.SupportedPaymentMethodTypes.c.f50292e, null);
                Boolean bool13 = (Boolean) cVarB.v(descriptor2, 40, hVar, null);
                String str21 = (String) cVarB.v(descriptor2, 41, z1Var, null);
                bool4 = (Boolean) cVarB.v(descriptor2, 42, hVar, null);
                theme = (Theme) cVarB.v(descriptor2, 43, Theme.c.f50364e, null);
                str = str21;
                i12 = 4095;
                bool5 = bool13;
                str9 = str20;
                z14 = zW9;
                z15 = zW7;
                z16 = zW6;
                z17 = zW5;
                z18 = zW4;
                z19 = zW8;
                i11 = -1;
                str11 = strT;
                z22 = zW10;
                supportedPaymentMethodTypes = supportedPaymentMethodTypes2;
                linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior2;
                bool6 = bool12;
                bool = bool11;
                bool2 = bool10;
                qVar = qVar4;
                map = map5;
                l0Var = l0Var2;
                str2 = str19;
                str3 = str18;
                str4 = str17;
                str5 = str16;
                str6 = str15;
                qVar2 = qVar3;
                financialConnectionsAuthorizationSession = financialConnectionsAuthorizationSession2;
                str7 = str14;
                str8 = str13;
                bool7 = bool8;
                map3 = map6;
                bool3 = bool9;
                map2 = map4;
                str10 = str12;
                z21 = zW3;
                product = product2;
                z12 = zW;
                list = list2;
                manualEntryMode = manualEntryMode2;
                z13 = zW2;
                z11 = zW11;
                pane = pane2;
            } else {
                LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior3 = null;
                int i15 = 0;
                boolean zW12 = false;
                boolean z23 = false;
                boolean z24 = false;
                boolean zW13 = false;
                boolean zW14 = false;
                boolean zW15 = false;
                boolean zW16 = false;
                boolean zW17 = false;
                boolean zW18 = false;
                int i16 = 0;
                boolean zW19 = false;
                boolean zW20 = false;
                boolean z25 = true;
                Map map7 = null;
                Boolean bool14 = null;
                FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes3 = null;
                Boolean bool15 = null;
                Boolean bool16 = null;
                FinancialConnectionsInstitution qVar5 = null;
                String str22 = null;
                Theme theme2 = null;
                String str23 = null;
                Boolean bool17 = null;
                Boolean bool18 = null;
                Boolean bool19 = null;
                String strT2 = null;
                Pane pane3 = null;
                ManualEntryMode manualEntryMode3 = null;
                List list3 = null;
                Product product3 = null;
                AccountDisconnectionMethod accountDisconnectionMethod3 = null;
                String str24 = null;
                Boolean bool20 = null;
                String str25 = null;
                String str26 = null;
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = null;
                FinancialConnectionsInstitution qVar6 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                Map map8 = null;
                TextUpdate l0Var3 = null;
                Map map9 = null;
                while (z25) {
                    String str32 = str22;
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            map7 = map7;
                            Boolean bool21 = bool14;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var4 = l0Var3;
                            i15 = i15;
                            jn0.h0 h0Var = jn0.h0.f84049a;
                            i16 = i16;
                            bool14 = bool21;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var4;
                            str22 = str32;
                            map9 = map9;
                            z25 = false;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 0:
                            map7 = map7;
                            Boolean bool22 = bool14;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var5 = l0Var3;
                            i15 = i15;
                            boolean zW21 = cVarB.w(descriptor2, 0);
                            jn0.h0 h0Var2 = jn0.h0.f84049a;
                            i16 |= 1;
                            bool14 = bool22;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var5;
                            str22 = str32;
                            map9 = map9;
                            z23 = zW21;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 1:
                            map7 = map7;
                            Boolean bool23 = bool14;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var6 = l0Var3;
                            i15 = i15;
                            boolean zW22 = cVarB.w(descriptor2, 1);
                            jn0.h0 h0Var3 = jn0.h0.f84049a;
                            i16 |= 2;
                            bool14 = bool23;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var6;
                            str22 = str32;
                            map9 = map9;
                            z24 = zW22;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 2:
                            zW19 = cVarB.w(descriptor2, 2);
                            i13 = i16 | 4;
                            jn0.h0 h0Var4 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 3:
                            zW17 = cVarB.w(descriptor2, 3);
                            i13 = i16 | 8;
                            jn0.h0 h0Var5 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 4:
                            strT2 = cVarB.t(descriptor2, 4);
                            i13 = i16 | 16;
                            jn0.h0 h0Var6 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 5:
                            zW16 = cVarB.w(descriptor2, 5);
                            i13 = i16 | 32;
                            jn0.h0 h0Var7 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 6:
                            zW15 = cVarB.w(descriptor2, 6);
                            i13 = i16 | 64;
                            jn0.h0 h0Var8 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 7:
                            zW14 = cVarB.w(descriptor2, 7);
                            i13 = i16 | 128;
                            jn0.h0 h0Var9 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 8:
                            zW18 = cVarB.w(descriptor2, 8);
                            i13 = i16 | 256;
                            jn0.h0 h0Var10 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 9:
                            zW13 = cVarB.w(descriptor2, 9);
                            i13 = i16 | 512;
                            jn0.h0 h0Var11 = jn0.h0.f84049a;
                            i16 = i13;
                            bool14 = bool14;
                            pane3 = pane3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 10:
                            Boolean bool24 = bool14;
                            int i17 = i16;
                            FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes4 = supportedPaymentMethodTypes3;
                            manualEntryMode3 = manualEntryMode3;
                            Pane pane4 = (Pane) cVarB.n(descriptor2, 10, Pane.c.f50360e, pane3);
                            jn0.h0 h0Var12 = jn0.h0.f84049a;
                            i16 = i17 | 1024;
                            bool14 = bool24;
                            pane3 = pane4;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes4;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 11:
                            map7 = map7;
                            bool14 = bool14;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var7 = l0Var3;
                            int i18 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            list3 = list3;
                            ManualEntryMode manualEntryMode4 = (ManualEntryMode) cVarB.n(descriptor2, 11, ManualEntryMode.c.f50375e, manualEntryMode3);
                            i14 = i18 | 2048;
                            jn0.h0 h0Var13 = jn0.h0.f84049a;
                            l0Var3 = l0Var7;
                            str22 = str32;
                            map9 = map9;
                            manualEntryMode3 = manualEntryMode4;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 12:
                            map7 = map7;
                            bool14 = bool14;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var8 = l0Var3;
                            int i19 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            List list4 = (List) cVarB.n(descriptor2, 12, dVarArr[12], list3);
                            i14 = i19 | 4096;
                            jn0.h0 h0Var14 = jn0.h0.f84049a;
                            l0Var3 = l0Var8;
                            str22 = str32;
                            map9 = map9;
                            list3 = list4;
                            manualEntryMode3 = manualEntryMode3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 13:
                            map7 = map7;
                            bool14 = bool14;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var9 = l0Var3;
                            int i21 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            Product product4 = (Product) cVarB.n(descriptor2, 13, Product.c.f50362e, product3);
                            i14 = i21 | PKIFailureInfo.certRevoked;
                            jn0.h0 h0Var15 = jn0.h0.f84049a;
                            l0Var3 = l0Var9;
                            str22 = str32;
                            map9 = map9;
                            product3 = product4;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 14:
                            zW20 = cVarB.w(descriptor2, 14);
                            i14 = i16 | 16384;
                            jn0.h0 h0Var16 = jn0.h0.f84049a;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 15:
                            zW12 = cVarB.w(descriptor2, 15);
                            i14 = i16 | 32768;
                            jn0.h0 h0Var17 = jn0.h0.f84049a;
                            l0Var3 = l0Var3;
                            str22 = str32;
                            map9 = map9;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 16:
                            map7 = map7;
                            bool14 = bool14;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var10 = l0Var3;
                            int i22 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str24 = str24;
                            AccountDisconnectionMethod accountDisconnectionMethod4 = (AccountDisconnectionMethod) cVarB.v(descriptor2, 16, AccountDisconnectionMethod.c.f50356e, accountDisconnectionMethod3);
                            i14 = i22 | 65536;
                            jn0.h0 h0Var18 = jn0.h0.f84049a;
                            l0Var3 = l0Var10;
                            str22 = str32;
                            map9 = map9;
                            accountDisconnectionMethod3 = accountDisconnectionMethod4;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 17:
                            map7 = map7;
                            bool14 = bool14;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var11 = l0Var3;
                            int i23 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            bool20 = bool20;
                            String str33 = (String) cVarB.v(descriptor2, 17, z1.f119730a, str24);
                            i14 = i23 | 131072;
                            jn0.h0 h0Var19 = jn0.h0.f84049a;
                            l0Var3 = l0Var11;
                            str22 = str32;
                            map9 = map9;
                            str24 = str33;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 18:
                            map7 = map7;
                            bool14 = bool14;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var12 = l0Var3;
                            int i24 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str25 = str25;
                            Boolean bool25 = (Boolean) cVarB.v(descriptor2, 18, vo0.h.f119620a, bool20);
                            i14 = i24 | 262144;
                            jn0.h0 h0Var20 = jn0.h0.f84049a;
                            l0Var3 = l0Var12;
                            str22 = str32;
                            map9 = map9;
                            bool20 = bool25;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 19:
                            map7 = map7;
                            bool14 = bool14;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var13 = l0Var3;
                            int i25 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str26 = str26;
                            String str34 = (String) cVarB.v(descriptor2, 19, z1.f119730a, str25);
                            i14 = i25 | PKIFailureInfo.signerNotTrusted;
                            jn0.h0 h0Var21 = jn0.h0.f84049a;
                            l0Var3 = l0Var13;
                            str22 = str32;
                            map9 = map9;
                            str25 = str34;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 20:
                            map7 = map7;
                            bool14 = bool14;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var14 = l0Var3;
                            int i26 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            String str35 = (String) cVarB.v(descriptor2, 20, z1.f119730a, str26);
                            i14 = i26 | PKIFailureInfo.badCertTemplate;
                            jn0.h0 h0Var22 = jn0.h0.f84049a;
                            l0Var3 = l0Var14;
                            str22 = str32;
                            map9 = map9;
                            str26 = str35;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 21:
                            map7 = map7;
                            bool14 = bool14;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var15 = l0Var3;
                            int i27 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            qVar6 = qVar6;
                            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession4 = (FinancialConnectionsAuthorizationSession) cVarB.v(descriptor2, 21, FinancialConnectionsAuthorizationSession.a.f50307a, financialConnectionsAuthorizationSession3);
                            i14 = i27 | PKIFailureInfo.badSenderNonce;
                            jn0.h0 h0Var23 = jn0.h0.f84049a;
                            l0Var3 = l0Var15;
                            str22 = str32;
                            map9 = map9;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession4;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 22:
                            map7 = map7;
                            bool14 = bool14;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var16 = l0Var3;
                            int i28 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str27 = str27;
                            FinancialConnectionsInstitution qVar7 = (FinancialConnectionsInstitution) cVarB.v(descriptor2, 22, FinancialConnectionsInstitution.a.f50550a, qVar6);
                            i14 = i28 | 4194304;
                            jn0.h0 h0Var24 = jn0.h0.f84049a;
                            l0Var3 = l0Var16;
                            str22 = str32;
                            map9 = map9;
                            qVar6 = qVar7;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 23:
                            map7 = map7;
                            bool14 = bool14;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var17 = l0Var3;
                            int i29 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str28 = str28;
                            String str36 = (String) cVarB.v(descriptor2, 23, z1.f119730a, str27);
                            i14 = i29 | 8388608;
                            jn0.h0 h0Var25 = jn0.h0.f84049a;
                            l0Var3 = l0Var17;
                            str22 = str32;
                            map9 = map9;
                            str27 = str36;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 24:
                            map7 = map7;
                            bool14 = bool14;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var18 = l0Var3;
                            int i31 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str29 = str29;
                            String str37 = (String) cVarB.v(descriptor2, 24, z1.f119730a, str28);
                            i14 = i31 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                            jn0.h0 h0Var26 = jn0.h0.f84049a;
                            l0Var3 = l0Var18;
                            str22 = str32;
                            map9 = map9;
                            str28 = str37;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 25:
                            map7 = map7;
                            bool14 = bool14;
                            str31 = str31;
                            map8 = map8;
                            TextUpdate l0Var19 = l0Var3;
                            int i32 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str30 = str30;
                            String str38 = (String) cVarB.v(descriptor2, 25, z1.f119730a, str29);
                            i14 = i32 | 33554432;
                            jn0.h0 h0Var27 = jn0.h0.f84049a;
                            l0Var3 = l0Var19;
                            str22 = str32;
                            map9 = map9;
                            str29 = str38;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 26:
                            map7 = map7;
                            bool14 = bool14;
                            map8 = map8;
                            TextUpdate l0Var20 = l0Var3;
                            int i33 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            str31 = str31;
                            String str39 = (String) cVarB.v(descriptor2, 26, z1.f119730a, str30);
                            i14 = i33 | 67108864;
                            jn0.h0 h0Var28 = jn0.h0.f84049a;
                            l0Var3 = l0Var20;
                            str22 = str32;
                            map9 = map9;
                            str30 = str39;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 27:
                            map7 = map7;
                            bool14 = bool14;
                            TextUpdate l0Var21 = l0Var3;
                            int i34 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            map8 = map8;
                            String str40 = (String) cVarB.v(descriptor2, 27, z1.f119730a, str31);
                            i14 = i34 | 134217728;
                            jn0.h0 h0Var29 = jn0.h0.f84049a;
                            l0Var3 = l0Var21;
                            str22 = str32;
                            map9 = map9;
                            str31 = str40;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 28:
                            map7 = map7;
                            bool14 = bool14;
                            TextUpdate l0Var22 = l0Var3;
                            int i35 = i16;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i15 = i15;
                            Map map10 = (Map) cVarB.v(descriptor2, 28, dVarArr[28], map8);
                            i14 = i35 | 268435456;
                            jn0.h0 h0Var30 = jn0.h0.f84049a;
                            l0Var3 = l0Var22;
                            str22 = str32;
                            map9 = map9;
                            map8 = map10;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i14;
                            bool14 = bool14;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 29:
                            map7 = map7;
                            Boolean bool26 = bool14;
                            TextUpdate l0Var23 = (TextUpdate) cVarB.v(descriptor2, 29, TextUpdate.a.f50516a, l0Var3);
                            int i36 = i16 | PKIFailureInfo.duplicateCertReq;
                            jn0.h0 h0Var31 = jn0.h0.f84049a;
                            i15 = i15;
                            str22 = str32;
                            manualEntryMode3 = manualEntryMode3;
                            list3 = list3;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            str24 = str24;
                            bool20 = bool20;
                            str25 = str25;
                            str26 = str26;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            qVar6 = qVar6;
                            str27 = str27;
                            str28 = str28;
                            str29 = str29;
                            str30 = str30;
                            str31 = str31;
                            map8 = map8;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes3;
                            i16 = i36;
                            bool14 = bool26;
                            map9 = map9;
                            pane3 = pane3;
                            l0Var3 = l0Var23;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 30:
                            Boolean bool27 = bool14;
                            int i37 = i16;
                            FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes5 = supportedPaymentMethodTypes3;
                            Map map11 = (Map) cVarB.v(descriptor2, 30, dVarArr[30], map9);
                            jn0.h0 h0Var32 = jn0.h0.f84049a;
                            str22 = str32;
                            manualEntryMode3 = manualEntryMode3;
                            l0Var3 = l0Var3;
                            supportedPaymentMethodTypes3 = supportedPaymentMethodTypes5;
                            map9 = map11;
                            i16 = i37 | 1073741824;
                            bool14 = bool27;
                            pane3 = pane3;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 31:
                            map7 = map7;
                            Boolean bool28 = bool14;
                            String str41 = (String) cVarB.v(descriptor2, 31, z1.f119730a, str32);
                            i16 |= Integer.MIN_VALUE;
                            jn0.h0 h0Var33 = jn0.h0.f84049a;
                            str22 = str41;
                            bool14 = bool28;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 32:
                            map7 = map7;
                            qVar5 = (FinancialConnectionsInstitution) cVarB.v(descriptor2, 32, FinancialConnectionsInstitution.a.f50550a, qVar5);
                            i15 |= 1;
                            jn0.h0 h0Var34 = jn0.h0.f84049a;
                            str22 = str32;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 33:
                            qVar5 = qVar5;
                            Boolean bool29 = (Boolean) cVarB.v(descriptor2, 33, vo0.h.f119620a, bool17);
                            i15 |= 2;
                            jn0.h0 h0Var35 = jn0.h0.f84049a;
                            map7 = map7;
                            bool17 = bool29;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 34:
                            bool16 = (Boolean) cVarB.v(descriptor2, 34, vo0.h.f119620a, bool16);
                            i15 |= 4;
                            jn0.h0 h0Var36 = jn0.h0.f84049a;
                            map7 = map7;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 35:
                            bool15 = (Boolean) cVarB.v(descriptor2, 35, vo0.h.f119620a, bool15);
                            i15 |= 8;
                            jn0.h0 h0Var37 = jn0.h0.f84049a;
                            map7 = map7;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 36:
                            bool14 = (Boolean) cVarB.v(descriptor2, 36, vo0.h.f119620a, bool14);
                            i15 |= 16;
                            jn0.h0 h0Var38 = jn0.h0.f84049a;
                            map7 = map7;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 37:
                            qVar5 = qVar5;
                            LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior4 = (LinkAccountSessionCancellationBehavior) cVarB.v(descriptor2, 37, LinkAccountSessionCancellationBehavior.c.f50358e, linkAccountSessionCancellationBehavior3);
                            i15 |= 32;
                            jn0.h0 h0Var39 = jn0.h0.f84049a;
                            map7 = map7;
                            linkAccountSessionCancellationBehavior3 = linkAccountSessionCancellationBehavior4;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 38:
                            map7 = (Map) cVarB.v(descriptor2, 38, dVarArr[38], map7);
                            i15 |= 64;
                            jn0.h0 h0Var310 = jn0.h0.f84049a;
                            map7 = map7;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 39:
                            qVar5 = qVar5;
                            supportedPaymentMethodTypes3 = (FinancialConnectionsAccount.SupportedPaymentMethodTypes) cVarB.v(descriptor2, 39, FinancialConnectionsAccount.SupportedPaymentMethodTypes.c.f50292e, supportedPaymentMethodTypes3);
                            i15 |= 128;
                            jn0.h0 h0Var40 = jn0.h0.f84049a;
                            map7 = map7;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 40:
                            qVar5 = qVar5;
                            Boolean bool30 = (Boolean) cVarB.v(descriptor2, 40, vo0.h.f119620a, bool19);
                            i15 |= 256;
                            jn0.h0 h0Var41 = jn0.h0.f84049a;
                            map7 = map7;
                            bool19 = bool30;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 41:
                            qVar5 = qVar5;
                            String str42 = (String) cVarB.v(descriptor2, 41, z1.f119730a, str23);
                            i15 |= 512;
                            jn0.h0 h0Var42 = jn0.h0.f84049a;
                            map7 = map7;
                            str23 = str42;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 42:
                            qVar5 = qVar5;
                            Boolean bool31 = (Boolean) cVarB.v(descriptor2, 42, vo0.h.f119620a, bool18);
                            i15 |= 1024;
                            jn0.h0 h0Var43 = jn0.h0.f84049a;
                            map7 = map7;
                            bool18 = bool31;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        case 43:
                            qVar5 = qVar5;
                            Theme theme3 = (Theme) cVarB.v(descriptor2, 43, Theme.c.f50364e, theme2);
                            i15 |= 2048;
                            jn0.h0 h0Var44 = jn0.h0.f84049a;
                            map7 = map7;
                            theme2 = theme3;
                            str22 = str32;
                            qVar5 = qVar5;
                            i15 = i15;
                            pane3 = pane3;
                            map8 = map8;
                            str31 = str31;
                            str30 = str30;
                            str29 = str29;
                            str28 = str28;
                            str27 = str27;
                            qVar6 = qVar6;
                            financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession3;
                            str26 = str26;
                            str25 = str25;
                            map7 = map7;
                            map9 = map9;
                            bool20 = bool20;
                            str24 = str24;
                            accountDisconnectionMethod3 = accountDisconnectionMethod3;
                            list3 = list3;
                            manualEntryMode3 = manualEntryMode3;
                            i15 = i15;
                            l0Var3 = l0Var3;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                Boolean bool32 = bool14;
                accountDisconnectionMethod = accountDisconnectionMethod3;
                i11 = i16;
                pane = pane3;
                bool = bool15;
                bool2 = bool16;
                qVar = qVar5;
                l0Var = l0Var3;
                theme = theme2;
                str = str23;
                bool3 = bool17;
                linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior3;
                bool4 = bool18;
                bool5 = bool19;
                bool6 = bool32;
                map = map9;
                map2 = map8;
                str2 = str31;
                str3 = str30;
                str4 = str29;
                str5 = str28;
                str6 = str27;
                qVar2 = qVar6;
                financialConnectionsAuthorizationSession = financialConnectionsAuthorizationSession3;
                str7 = str26;
                str8 = str25;
                map3 = map7;
                str9 = str22;
                bool7 = bool20;
                str10 = str24;
                list = list3;
                str11 = strT2;
                z11 = zW12;
                manualEntryMode = manualEntryMode3;
                z12 = z23;
                z13 = z24;
                product = product3;
                i12 = i15;
                z14 = zW13;
                z15 = zW14;
                z16 = zW15;
                z17 = zW16;
                z18 = zW17;
                z19 = zW18;
                supportedPaymentMethodTypes = supportedPaymentMethodTypes3;
                z21 = zW19;
                z22 = zW20;
            }
            AccountDisconnectionMethod accountDisconnectionMethod5 = accountDisconnectionMethod;
            cVarB.c(descriptor2);
            return new FinancialConnectionsSessionManifest(i11, i12, z12, z13, z21, z18, str11, z17, z16, z15, z19, z14, pane, manualEntryMode, list, product, z22, z11, accountDisconnectionMethod5, str10, bool7, str8, str7, financialConnectionsAuthorizationSession, qVar2, str6, str5, str4, str3, str2, map2, l0Var, map, str9, qVar, bool3, bool2, bool, bool6, linkAccountSessionCancellationBehavior, map3, supportedPaymentMethodTypes, bool5, str, bool4, theme, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, FinancialConnectionsSessionManifest value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            FinancialConnectionsSessionManifest.R(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = FinancialConnectionsSessionManifest.T;
            vo0.h hVar = vo0.h.f119620a;
            z1 z1Var = z1.f119730a;
            ro0.d<?> dVar = dVarArr[12];
            ro0.d<?> dVarP = so0.a.p(AccountDisconnectionMethod.c.f50356e);
            ro0.d<?> dVarP2 = so0.a.p(z1Var);
            ro0.d<?> dVarP3 = so0.a.p(hVar);
            ro0.d<?> dVarP4 = so0.a.p(z1Var);
            ro0.d<?> dVarP5 = so0.a.p(z1Var);
            ro0.d<?> dVarP6 = so0.a.p(FinancialConnectionsAuthorizationSession.a.f50307a);
            FinancialConnectionsInstitution.a aVar = FinancialConnectionsInstitution.a.f50550a;
            return new ro0.d[]{hVar, hVar, hVar, hVar, z1Var, hVar, hVar, hVar, hVar, hVar, Pane.c.f50360e, ManualEntryMode.c.f50375e, dVar, Product.c.f50362e, hVar, hVar, dVarP, dVarP2, dVarP3, dVarP4, dVarP5, dVarP6, so0.a.p(aVar), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(dVarArr[28]), so0.a.p(TextUpdate.a.f50516a), so0.a.p(dVarArr[30]), so0.a.p(z1Var), so0.a.p(aVar), so0.a.p(hVar), so0.a.p(hVar), so0.a.p(hVar), so0.a.p(hVar), so0.a.p(LinkAccountSessionCancellationBehavior.c.f50358e), so0.a.p(dVarArr[38]), so0.a.p(FinancialConnectionsAccount.SupportedPaymentMethodTypes.c.f50292e), so0.a.p(hVar), so0.a.p(z1Var), so0.a.p(hVar), so0.a.p(Theme.c.f50364e)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<FinancialConnectionsSessionManifest> serializer() {
            return a.f50365a;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<FinancialConnectionsSessionManifest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSessionManifest createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String string = parcel.readString();
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            Pane paneValueOf = Pane.valueOf(parcel.readString());
            ManualEntryMode manualEntryModeValueOf = ManualEntryMode.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(FinancialConnectionsAccount.Permissions.valueOf(parcel.readString()));
            }
            Product productValueOf = Product.valueOf(parcel.readString());
            boolean z21 = parcel.readInt() != 0;
            boolean z22 = parcel.readInt() != 0;
            AccountDisconnectionMethod accountDisconnectionMethodValueOf = parcel.readInt() == 0 ? null : AccountDisconnectionMethod.valueOf(parcel.readString());
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSessionCreateFromParcel = parcel.readInt() == 0 ? null : FinancialConnectionsAuthorizationSession.CREATOR.createFromParcel(parcel);
            FinancialConnectionsInstitution qVarCreateFromParcel = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                int i14 = 0;
                while (i14 != i13) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i14++;
                    i13 = i13;
                }
            }
            TextUpdate l0VarCreateFromParcel = parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i15);
                int i16 = 0;
                while (i16 != i15) {
                    int i17 = i16;
                    int i18 = i15;
                    linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    i16 = i17 + 1;
                    i15 = i18;
                }
                l0VarCreateFromParcel = l0VarCreateFromParcel;
            }
            String string10 = parcel.readString();
            FinancialConnectionsInstitution qVarCreateFromParcel2 = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehaviorValueOf = parcel.readInt() == 0 ? null : LinkAccountSessionCancellationBehavior.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i19 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(i19);
                int i21 = 0;
                while (i21 != i19) {
                    int i22 = i21;
                    TextUpdate l0Var = l0VarCreateFromParcel;
                    linkedHashMap3.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    i21 = i22 + 1;
                    l0VarCreateFromParcel = l0Var;
                }
            }
            return new FinancialConnectionsSessionManifest(z11, z12, z13, z14, string, z15, z16, z17, z18, z19, paneValueOf, manualEntryModeValueOf, arrayList, productValueOf, z21, z22, accountDisconnectionMethodValueOf, string2, boolValueOf, string3, string4, financialConnectionsAuthorizationSessionCreateFromParcel, qVarCreateFromParcel, string5, string6, string7, string8, string9, linkedHashMap, l0VarCreateFromParcel, linkedHashMap2, string10, qVarCreateFromParcel2, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, linkAccountSessionCancellationBehaviorValueOf, linkedHashMap3, parcel.readInt() == 0 ? null : FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSessionManifest[] newArray(int i11) {
            return new FinancialConnectionsSessionManifest[i11];
        }
    }

    static {
        vo0.e eVar = new vo0.e(FinancialConnectionsAccount.Permissions.c.f50286e);
        z1 z1Var = z1.f119730a;
        vo0.m0 m0Var = new vo0.m0(z1Var, z1Var);
        vo0.h hVar = vo0.h.f119620a;
        T = new ro0.d[]{null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, m0Var, null, new vo0.m0(z1Var, hVar), null, null, null, null, null, null, null, new vo0.m0(z1Var, hVar), null, null, null, null, null};
    }

    @jn0.e
    public /* synthetic */ FinancialConnectionsSessionManifest(int i11, int i12, @ro0.o("allow_manual_entry") boolean z11, @ro0.o("consent_required") boolean z12, @ro0.o("custom_manual_entry_handling") boolean z13, @ro0.o("disable_link_more_accounts") boolean z14, @ro0.o("id") String str, @ro0.o("instant_verification_disabled") boolean z15, @ro0.o("institution_search_disabled") boolean z16, @ro0.o("livemode") boolean z17, @ro0.o("manual_entry_uses_microdeposits") boolean z18, @ro0.o("mobile_handoff_enabled") boolean z19, @ro0.o("next_pane") Pane pane, @ro0.o("manual_entry_mode") ManualEntryMode manualEntryMode, @ro0.o("permissions") List list, @ro0.o("product") Product product, @ro0.o("single_account") boolean z21, @ro0.o("use_single_sort_search") boolean z22, @ro0.o("account_disconnection_method") AccountDisconnectionMethod accountDisconnectionMethod, @ro0.o("accountholder_customer_email_address") String str2, @ro0.o("accountholder_is_link_consumer") Boolean bool, @ro0.o("accountholder_phone_number") String str3, @ro0.o("accountholder_token") String str4, @ro0.o("active_auth_session") FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, @ro0.o("active_institution") FinancialConnectionsInstitution qVar, @ro0.o("assignment_event_id") String str5, @ro0.o("business_name") String str6, @ro0.o("cancel_url") String str7, @ro0.o("connect_platform_name") String str8, @ro0.o("connected_account_name") String str9, @ro0.o("experiment_assignments") Map map, @ro0.o("display_text") TextUpdate l0Var, @ro0.o(AnalyticsContext.Features) Map map2, @ro0.o("hosted_auth_url") String str10, @ro0.o("initial_institution") FinancialConnectionsInstitution qVar2, @ro0.o("is_end_user_facing") Boolean bool2, @ro0.o("is_link_with_stripe") Boolean bool3, @ro0.o("is_networking_user_flow") Boolean bool4, @ro0.o("is_stripe_direct") Boolean bool5, @ro0.o("link_account_session_cancellation_behavior") LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, @ro0.o("modal_customization") Map map3, @ro0.o("payment_method_type") FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, @ro0.o("step_up_authentication_required") Boolean bool6, @ro0.o("success_url") String str11, @ro0.o("skip_success_pane") Boolean bool7, @ro0.o("theme") Theme theme, v1 v1Var) {
        if (65535 != (i11 & 65535)) {
            h1.a(new int[]{i11, i12}, new int[]{65535, 0}, a.f50365a.getDescriptor());
        }
        this.allowManualEntry = z11;
        this.consentRequired = z12;
        this.customManualEntryHandling = z13;
        this.disableLinkMoreAccounts = z14;
        this.id = str;
        this.instantVerificationDisabled = z15;
        this.institutionSearchDisabled = z16;
        this.livemode = z17;
        this.manualEntryUsesMicrodeposits = z18;
        this.mobileHandoffEnabled = z19;
        this.nextPane = pane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = list;
        this.product = product;
        this.singleAccount = z21;
        this.useSingleSortSearch = z22;
        if ((65536 & i11) == 0) {
            this.accountDisconnectionMethod = null;
        } else {
            this.accountDisconnectionMethod = accountDisconnectionMethod;
        }
        if ((131072 & i11) == 0) {
            this.accountholderCustomerEmailAddress = null;
        } else {
            this.accountholderCustomerEmailAddress = str2;
        }
        if ((262144 & i11) == 0) {
            this.accountholderIsLinkConsumer = null;
        } else {
            this.accountholderIsLinkConsumer = bool;
        }
        if ((524288 & i11) == 0) {
            this.accountholderPhoneNumber = null;
        } else {
            this.accountholderPhoneNumber = str3;
        }
        if ((1048576 & i11) == 0) {
            this.accountholderToken = null;
        } else {
            this.accountholderToken = str4;
        }
        if ((2097152 & i11) == 0) {
            this.activeAuthSession = null;
        } else {
            this.activeAuthSession = financialConnectionsAuthorizationSession;
        }
        if ((4194304 & i11) == 0) {
            this.activeInstitution = null;
        } else {
            this.activeInstitution = qVar;
        }
        if ((8388608 & i11) == 0) {
            this.assignmentEventId = null;
        } else {
            this.assignmentEventId = str5;
        }
        if ((16777216 & i11) == 0) {
            this.businessName = null;
        } else {
            this.businessName = str6;
        }
        if ((33554432 & i11) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str7;
        }
        if ((67108864 & i11) == 0) {
            this.connectPlatformName = null;
        } else {
            this.connectPlatformName = str8;
        }
        if ((134217728 & i11) == 0) {
            this.connectedAccountName = null;
        } else {
            this.connectedAccountName = str9;
        }
        if ((268435456 & i11) == 0) {
            this.experimentAssignments = null;
        } else {
            this.experimentAssignments = map;
        }
        if ((536870912 & i11) == 0) {
            this.displayText = null;
        } else {
            this.displayText = l0Var;
        }
        if ((1073741824 & i11) == 0) {
            this.features = null;
        } else {
            this.features = map2;
        }
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str10;
        }
        if ((i12 & 1) == 0) {
            this.initialInstitution = null;
        } else {
            this.initialInstitution = qVar2;
        }
        if ((i12 & 2) == 0) {
            this.isEndUserFacing = null;
        } else {
            this.isEndUserFacing = bool2;
        }
        if ((i12 & 4) == 0) {
            this.isLinkWithStripe = null;
        } else {
            this.isLinkWithStripe = bool3;
        }
        if ((i12 & 8) == 0) {
            this.isNetworkingUserFlow = null;
        } else {
            this.isNetworkingUserFlow = bool4;
        }
        if ((i12 & 16) == 0) {
            this.isStripeDirect = null;
        } else {
            this.isStripeDirect = bool5;
        }
        if ((i12 & 32) == 0) {
            this.linkAccountSessionCancellationBehavior = null;
        } else {
            this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        }
        if ((i12 & 64) == 0) {
            this.modalCustomization = null;
        } else {
            this.modalCustomization = map3;
        }
        if ((i12 & 128) == 0) {
            this.paymentMethodType = null;
        } else {
            this.paymentMethodType = supportedPaymentMethodTypes;
        }
        if ((i12 & 256) == 0) {
            this.stepUpAuthenticationRequired = null;
        } else {
            this.stepUpAuthenticationRequired = bool6;
        }
        if ((i12 & 512) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str11;
        }
        if ((i12 & 1024) == 0) {
            this.skipSuccessPane = null;
        } else {
            this.skipSuccessPane = bool7;
        }
        if ((i12 & 2048) == 0) {
            this.theme = null;
        } else {
            this.theme = theme;
        }
    }

    public static final /* synthetic */ void R(FinancialConnectionsSessionManifest self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = T;
        output.A(serialDesc, 0, self.allowManualEntry);
        output.A(serialDesc, 1, self.consentRequired);
        output.A(serialDesc, 2, self.customManualEntryHandling);
        output.A(serialDesc, 3, self.disableLinkMoreAccounts);
        output.e(serialDesc, 4, self.id);
        output.A(serialDesc, 5, self.instantVerificationDisabled);
        output.A(serialDesc, 6, self.institutionSearchDisabled);
        output.A(serialDesc, 7, self.livemode);
        output.A(serialDesc, 8, self.manualEntryUsesMicrodeposits);
        output.A(serialDesc, 9, self.mobileHandoffEnabled);
        output.D(serialDesc, 10, Pane.c.f50360e, self.nextPane);
        output.D(serialDesc, 11, ManualEntryMode.c.f50375e, self.manualEntryMode);
        output.D(serialDesc, 12, dVarArr[12], self.permissions);
        output.D(serialDesc, 13, Product.c.f50362e, self.product);
        output.A(serialDesc, 14, self.singleAccount);
        output.A(serialDesc, 15, self.useSingleSortSearch);
        if (output.G(serialDesc, 16) || self.accountDisconnectionMethod != null) {
            output.y(serialDesc, 16, AccountDisconnectionMethod.c.f50356e, self.accountDisconnectionMethod);
        }
        if (output.G(serialDesc, 17) || self.accountholderCustomerEmailAddress != null) {
            output.y(serialDesc, 17, z1.f119730a, self.accountholderCustomerEmailAddress);
        }
        if (output.G(serialDesc, 18) || self.accountholderIsLinkConsumer != null) {
            output.y(serialDesc, 18, vo0.h.f119620a, self.accountholderIsLinkConsumer);
        }
        if (output.G(serialDesc, 19) || self.accountholderPhoneNumber != null) {
            output.y(serialDesc, 19, z1.f119730a, self.accountholderPhoneNumber);
        }
        if (output.G(serialDesc, 20) || self.accountholderToken != null) {
            output.y(serialDesc, 20, z1.f119730a, self.accountholderToken);
        }
        if (output.G(serialDesc, 21) || self.activeAuthSession != null) {
            output.y(serialDesc, 21, FinancialConnectionsAuthorizationSession.a.f50307a, self.activeAuthSession);
        }
        if (output.G(serialDesc, 22) || self.activeInstitution != null) {
            output.y(serialDesc, 22, FinancialConnectionsInstitution.a.f50550a, self.activeInstitution);
        }
        if (output.G(serialDesc, 23) || self.assignmentEventId != null) {
            output.y(serialDesc, 23, z1.f119730a, self.assignmentEventId);
        }
        if (output.G(serialDesc, 24) || self.businessName != null) {
            output.y(serialDesc, 24, z1.f119730a, self.businessName);
        }
        if (output.G(serialDesc, 25) || self.cancelUrl != null) {
            output.y(serialDesc, 25, z1.f119730a, self.cancelUrl);
        }
        if (output.G(serialDesc, 26) || self.connectPlatformName != null) {
            output.y(serialDesc, 26, z1.f119730a, self.connectPlatformName);
        }
        if (output.G(serialDesc, 27) || self.connectedAccountName != null) {
            output.y(serialDesc, 27, z1.f119730a, self.connectedAccountName);
        }
        if (output.G(serialDesc, 28) || self.experimentAssignments != null) {
            output.y(serialDesc, 28, dVarArr[28], self.experimentAssignments);
        }
        if (output.G(serialDesc, 29) || self.displayText != null) {
            output.y(serialDesc, 29, TextUpdate.a.f50516a, self.displayText);
        }
        if (output.G(serialDesc, 30) || self.features != null) {
            output.y(serialDesc, 30, dVarArr[30], self.features);
        }
        if (output.G(serialDesc, 31) || self.hostedAuthUrl != null) {
            output.y(serialDesc, 31, z1.f119730a, self.hostedAuthUrl);
        }
        if (output.G(serialDesc, 32) || self.initialInstitution != null) {
            output.y(serialDesc, 32, FinancialConnectionsInstitution.a.f50550a, self.initialInstitution);
        }
        if (output.G(serialDesc, 33) || self.isEndUserFacing != null) {
            output.y(serialDesc, 33, vo0.h.f119620a, self.isEndUserFacing);
        }
        if (output.G(serialDesc, 34) || self.isLinkWithStripe != null) {
            output.y(serialDesc, 34, vo0.h.f119620a, self.isLinkWithStripe);
        }
        if (output.G(serialDesc, 35) || self.isNetworkingUserFlow != null) {
            output.y(serialDesc, 35, vo0.h.f119620a, self.isNetworkingUserFlow);
        }
        if (output.G(serialDesc, 36) || self.isStripeDirect != null) {
            output.y(serialDesc, 36, vo0.h.f119620a, self.isStripeDirect);
        }
        if (output.G(serialDesc, 37) || self.linkAccountSessionCancellationBehavior != null) {
            output.y(serialDesc, 37, LinkAccountSessionCancellationBehavior.c.f50358e, self.linkAccountSessionCancellationBehavior);
        }
        if (output.G(serialDesc, 38) || self.modalCustomization != null) {
            output.y(serialDesc, 38, dVarArr[38], self.modalCustomization);
        }
        if (output.G(serialDesc, 39) || self.paymentMethodType != null) {
            output.y(serialDesc, 39, FinancialConnectionsAccount.SupportedPaymentMethodTypes.c.f50292e, self.paymentMethodType);
        }
        if (output.G(serialDesc, 40) || self.stepUpAuthenticationRequired != null) {
            output.y(serialDesc, 40, vo0.h.f119620a, self.stepUpAuthenticationRequired);
        }
        if (output.G(serialDesc, 41) || self.successUrl != null) {
            output.y(serialDesc, 41, z1.f119730a, self.successUrl);
        }
        if (output.G(serialDesc, 42) || self.skipSuccessPane != null) {
            output.y(serialDesc, 42, vo0.h.f119620a, self.skipSuccessPane);
        }
        if (!output.G(serialDesc, 43) && self.theme == null) {
            return;
        }
        output.y(serialDesc, 43, Theme.c.f50364e, self.theme);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final ManualEntryMode getManualEntryMode() {
        return this.manualEntryMode;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getManualEntryUsesMicrodeposits() {
        return this.manualEntryUsesMicrodeposits;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Pane getNextPane() {
        return this.nextPane;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final FinancialConnectionsAccount.SupportedPaymentMethodTypes getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getSingleAccount() {
        return this.singleAccount;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Boolean getSkipSuccessPane() {
        return this.skipSuccessPane;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Boolean getIsLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Boolean getIsNetworkingUserFlow() {
        return this.isNetworkingUserFlow;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Boolean getIsStripeDirect() {
        return this.isStripeDirect;
    }

    public final FinancialConnectionsSessionManifest b(boolean allowManualEntry, boolean consentRequired, boolean customManualEntryHandling, boolean disableLinkMoreAccounts, String id2, boolean instantVerificationDisabled, boolean institutionSearchDisabled, boolean livemode, boolean manualEntryUsesMicrodeposits, boolean mobileHandoffEnabled, Pane nextPane, ManualEntryMode manualEntryMode, List<? extends FinancialConnectionsAccount.Permissions> permissions, Product product, boolean singleAccount, boolean useSingleSortSearch, AccountDisconnectionMethod accountDisconnectionMethod, String accountholderCustomerEmailAddress, Boolean accountholderIsLinkConsumer, String accountholderPhoneNumber, String accountholderToken, FinancialConnectionsAuthorizationSession activeAuthSession, FinancialConnectionsInstitution activeInstitution, String assignmentEventId, String businessName, String cancelUrl, String connectPlatformName, String connectedAccountName, Map<String, String> experimentAssignments, TextUpdate displayText, Map<String, Boolean> features, String hostedAuthUrl, FinancialConnectionsInstitution initialInstitution, Boolean isEndUserFacing, Boolean isLinkWithStripe, Boolean isNetworkingUserFlow, Boolean isStripeDirect, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map<String, Boolean> modalCustomization, FinancialConnectionsAccount.SupportedPaymentMethodTypes paymentMethodType, Boolean stepUpAuthenticationRequired, String successUrl, Boolean skipSuccessPane, Theme theme) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(nextPane, "nextPane");
        p013kotlin.jvm.internal.s.k(manualEntryMode, "manualEntryMode");
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        p013kotlin.jvm.internal.s.k(product, "product");
        return new FinancialConnectionsSessionManifest(allowManualEntry, consentRequired, customManualEntryHandling, disableLinkMoreAccounts, id2, instantVerificationDisabled, institutionSearchDisabled, livemode, manualEntryUsesMicrodeposits, mobileHandoffEnabled, nextPane, manualEntryMode, permissions, product, singleAccount, useSingleSortSearch, accountDisconnectionMethod, accountholderCustomerEmailAddress, accountholderIsLinkConsumer, accountholderPhoneNumber, accountholderToken, activeAuthSession, activeInstitution, assignmentEventId, businessName, cancelUrl, connectPlatformName, connectedAccountName, experimentAssignments, displayText, features, hostedAuthUrl, initialInstitution, isEndUserFacing, isLinkWithStripe, isNetworkingUserFlow, isStripeDirect, linkAccountSessionCancellationBehavior, modalCustomization, paymentMethodType, stepUpAuthenticationRequired, successUrl, skipSuccessPane, theme);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAccountholderCustomerEmailAddress() {
        return this.accountholderCustomerEmailAddress;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getAccountholderIsLinkConsumer() {
        return this.accountholderIsLinkConsumer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSessionManifest)) {
            return false;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) other;
        return this.allowManualEntry == financialConnectionsSessionManifest.allowManualEntry && this.consentRequired == financialConnectionsSessionManifest.consentRequired && this.customManualEntryHandling == financialConnectionsSessionManifest.customManualEntryHandling && this.disableLinkMoreAccounts == financialConnectionsSessionManifest.disableLinkMoreAccounts && p013kotlin.jvm.internal.s.f(this.id, financialConnectionsSessionManifest.id) && this.instantVerificationDisabled == financialConnectionsSessionManifest.instantVerificationDisabled && this.institutionSearchDisabled == financialConnectionsSessionManifest.institutionSearchDisabled && this.livemode == financialConnectionsSessionManifest.livemode && this.manualEntryUsesMicrodeposits == financialConnectionsSessionManifest.manualEntryUsesMicrodeposits && this.mobileHandoffEnabled == financialConnectionsSessionManifest.mobileHandoffEnabled && this.nextPane == financialConnectionsSessionManifest.nextPane && this.manualEntryMode == financialConnectionsSessionManifest.manualEntryMode && p013kotlin.jvm.internal.s.f(this.permissions, financialConnectionsSessionManifest.permissions) && this.product == financialConnectionsSessionManifest.product && this.singleAccount == financialConnectionsSessionManifest.singleAccount && this.useSingleSortSearch == financialConnectionsSessionManifest.useSingleSortSearch && this.accountDisconnectionMethod == financialConnectionsSessionManifest.accountDisconnectionMethod && p013kotlin.jvm.internal.s.f(this.accountholderCustomerEmailAddress, financialConnectionsSessionManifest.accountholderCustomerEmailAddress) && p013kotlin.jvm.internal.s.f(this.accountholderIsLinkConsumer, financialConnectionsSessionManifest.accountholderIsLinkConsumer) && p013kotlin.jvm.internal.s.f(this.accountholderPhoneNumber, financialConnectionsSessionManifest.accountholderPhoneNumber) && p013kotlin.jvm.internal.s.f(this.accountholderToken, financialConnectionsSessionManifest.accountholderToken) && p013kotlin.jvm.internal.s.f(this.activeAuthSession, financialConnectionsSessionManifest.activeAuthSession) && p013kotlin.jvm.internal.s.f(this.activeInstitution, financialConnectionsSessionManifest.activeInstitution) && p013kotlin.jvm.internal.s.f(this.assignmentEventId, financialConnectionsSessionManifest.assignmentEventId) && p013kotlin.jvm.internal.s.f(this.businessName, financialConnectionsSessionManifest.businessName) && p013kotlin.jvm.internal.s.f(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && p013kotlin.jvm.internal.s.f(this.connectPlatformName, financialConnectionsSessionManifest.connectPlatformName) && p013kotlin.jvm.internal.s.f(this.connectedAccountName, financialConnectionsSessionManifest.connectedAccountName) && p013kotlin.jvm.internal.s.f(this.experimentAssignments, financialConnectionsSessionManifest.experimentAssignments) && p013kotlin.jvm.internal.s.f(this.displayText, financialConnectionsSessionManifest.displayText) && p013kotlin.jvm.internal.s.f(this.features, financialConnectionsSessionManifest.features) && p013kotlin.jvm.internal.s.f(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && p013kotlin.jvm.internal.s.f(this.initialInstitution, financialConnectionsSessionManifest.initialInstitution) && p013kotlin.jvm.internal.s.f(this.isEndUserFacing, financialConnectionsSessionManifest.isEndUserFacing) && p013kotlin.jvm.internal.s.f(this.isLinkWithStripe, financialConnectionsSessionManifest.isLinkWithStripe) && p013kotlin.jvm.internal.s.f(this.isNetworkingUserFlow, financialConnectionsSessionManifest.isNetworkingUserFlow) && p013kotlin.jvm.internal.s.f(this.isStripeDirect, financialConnectionsSessionManifest.isStripeDirect) && this.linkAccountSessionCancellationBehavior == financialConnectionsSessionManifest.linkAccountSessionCancellationBehavior && p013kotlin.jvm.internal.s.f(this.modalCustomization, financialConnectionsSessionManifest.modalCustomization) && this.paymentMethodType == financialConnectionsSessionManifest.paymentMethodType && p013kotlin.jvm.internal.s.f(this.stepUpAuthenticationRequired, financialConnectionsSessionManifest.stepUpAuthenticationRequired) && p013kotlin.jvm.internal.s.f(this.successUrl, financialConnectionsSessionManifest.successUrl) && p013kotlin.jvm.internal.s.f(this.skipSuccessPane, financialConnectionsSessionManifest.skipSuccessPane) && this.theme == financialConnectionsSessionManifest.theme;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAccountholderPhoneNumber() {
        return this.accountholderPhoneNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAccountholderToken() {
        return this.accountholderToken;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final FinancialConnectionsAuthorizationSession getActiveAuthSession() {
        return this.activeAuthSession;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((Boolean.hashCode(this.allowManualEntry) * 31) + Boolean.hashCode(this.consentRequired)) * 31) + Boolean.hashCode(this.customManualEntryHandling)) * 31) + Boolean.hashCode(this.disableLinkMoreAccounts)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.instantVerificationDisabled)) * 31) + Boolean.hashCode(this.institutionSearchDisabled)) * 31) + Boolean.hashCode(this.livemode)) * 31) + Boolean.hashCode(this.manualEntryUsesMicrodeposits)) * 31) + Boolean.hashCode(this.mobileHandoffEnabled)) * 31) + this.nextPane.hashCode()) * 31) + this.manualEntryMode.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.product.hashCode()) * 31) + Boolean.hashCode(this.singleAccount)) * 31) + Boolean.hashCode(this.useSingleSortSearch)) * 31;
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        int iHashCode2 = (iHashCode + (accountDisconnectionMethod == null ? 0 : accountDisconnectionMethod.hashCode())) * 31;
        String str = this.accountholderCustomerEmailAddress;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.accountholderIsLinkConsumer;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.accountholderPhoneNumber;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountholderToken;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        int iHashCode7 = (iHashCode6 + (financialConnectionsAuthorizationSession == null ? 0 : financialConnectionsAuthorizationSession.hashCode())) * 31;
        FinancialConnectionsInstitution qVar = this.activeInstitution;
        int iHashCode8 = (iHashCode7 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str4 = this.assignmentEventId;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.businessName;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cancelUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.connectPlatformName;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.connectedAccountName;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.experimentAssignments;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        TextUpdate l0Var = this.displayText;
        int iHashCode15 = (iHashCode14 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        Map<String, Boolean> map2 = this.features;
        int iHashCode16 = (iHashCode15 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str9 = this.hostedAuthUrl;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        FinancialConnectionsInstitution qVar2 = this.initialInstitution;
        int iHashCode18 = (iHashCode17 + (qVar2 == null ? 0 : qVar2.hashCode())) * 31;
        Boolean bool2 = this.isEndUserFacing;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLinkWithStripe;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNetworkingUserFlow;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isStripeDirect;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        int iHashCode23 = (iHashCode22 + (linkAccountSessionCancellationBehavior == null ? 0 : linkAccountSessionCancellationBehavior.hashCode())) * 31;
        Map<String, Boolean> map3 = this.modalCustomization;
        int iHashCode24 = (iHashCode23 + (map3 == null ? 0 : map3.hashCode())) * 31;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        int iHashCode25 = (iHashCode24 + (supportedPaymentMethodTypes == null ? 0 : supportedPaymentMethodTypes.hashCode())) * 31;
        Boolean bool6 = this.stepUpAuthenticationRequired;
        int iHashCode26 = (iHashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str10 = this.successUrl;
        int iHashCode27 = (iHashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool7 = this.skipSuccessPane;
        int iHashCode28 = (iHashCode27 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Theme theme = this.theme;
        return iHashCode28 + (theme != null ? theme.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final FinancialConnectionsInstitution getActiveInstitution() {
        return this.activeInstitution;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getAssignmentEventId() {
        return this.assignmentEventId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getBusinessName() {
        return this.businessName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getConnectPlatformName() {
        return this.connectPlatformName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getDisableLinkMoreAccounts() {
        return this.disableLinkMoreAccounts;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final TextUpdate getDisplayText() {
        return this.displayText;
    }

    public String toString() {
        return "FinancialConnectionsSessionManifest(allowManualEntry=" + this.allowManualEntry + ", consentRequired=" + this.consentRequired + ", customManualEntryHandling=" + this.customManualEntryHandling + ", disableLinkMoreAccounts=" + this.disableLinkMoreAccounts + ", id=" + this.id + ", instantVerificationDisabled=" + this.instantVerificationDisabled + ", institutionSearchDisabled=" + this.institutionSearchDisabled + ", livemode=" + this.livemode + ", manualEntryUsesMicrodeposits=" + this.manualEntryUsesMicrodeposits + ", mobileHandoffEnabled=" + this.mobileHandoffEnabled + ", nextPane=" + this.nextPane + ", manualEntryMode=" + this.manualEntryMode + ", permissions=" + this.permissions + ", product=" + this.product + ", singleAccount=" + this.singleAccount + ", useSingleSortSearch=" + this.useSingleSortSearch + ", accountDisconnectionMethod=" + this.accountDisconnectionMethod + ", accountholderCustomerEmailAddress=" + this.accountholderCustomerEmailAddress + ", accountholderIsLinkConsumer=" + this.accountholderIsLinkConsumer + ", accountholderPhoneNumber=" + this.accountholderPhoneNumber + ", accountholderToken=" + this.accountholderToken + ", activeAuthSession=" + this.activeAuthSession + ", activeInstitution=" + this.activeInstitution + ", assignmentEventId=" + this.assignmentEventId + ", businessName=" + this.businessName + ", cancelUrl=" + this.cancelUrl + ", connectPlatformName=" + this.connectPlatformName + ", connectedAccountName=" + this.connectedAccountName + ", experimentAssignments=" + this.experimentAssignments + ", displayText=" + this.displayText + ", features=" + this.features + ", hostedAuthUrl=" + this.hostedAuthUrl + ", initialInstitution=" + this.initialInstitution + ", isEndUserFacing=" + this.isEndUserFacing + ", isLinkWithStripe=" + this.isLinkWithStripe + ", isNetworkingUserFlow=" + this.isNetworkingUserFlow + ", isStripeDirect=" + this.isStripeDirect + ", linkAccountSessionCancellationBehavior=" + this.linkAccountSessionCancellationBehavior + ", modalCustomization=" + this.modalCustomization + ", paymentMethodType=" + this.paymentMethodType + ", stepUpAuthenticationRequired=" + this.stepUpAuthenticationRequired + ", successUrl=" + this.successUrl + ", skipSuccessPane=" + this.skipSuccessPane + ", theme=" + this.theme + ")";
    }

    public final Map<String, String> u() {
        return this.experimentAssignments;
    }

    public final Map<String, Boolean> v() {
        return this.features;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(this.allowManualEntry ? 1 : 0);
        parcel.writeInt(this.consentRequired ? 1 : 0);
        parcel.writeInt(this.customManualEntryHandling ? 1 : 0);
        parcel.writeInt(this.disableLinkMoreAccounts ? 1 : 0);
        parcel.writeString(this.id);
        parcel.writeInt(this.instantVerificationDisabled ? 1 : 0);
        parcel.writeInt(this.institutionSearchDisabled ? 1 : 0);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeInt(this.manualEntryUsesMicrodeposits ? 1 : 0);
        parcel.writeInt(this.mobileHandoffEnabled ? 1 : 0);
        parcel.writeString(this.nextPane.name());
        parcel.writeString(this.manualEntryMode.name());
        List<FinancialConnectionsAccount.Permissions> list = this.permissions;
        parcel.writeInt(list.size());
        Iterator<FinancialConnectionsAccount.Permissions> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        parcel.writeString(this.product.name());
        parcel.writeInt(this.singleAccount ? 1 : 0);
        parcel.writeInt(this.useSingleSortSearch ? 1 : 0);
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        if (accountDisconnectionMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(accountDisconnectionMethod.name());
        }
        parcel.writeString(this.accountholderCustomerEmailAddress);
        Boolean bool = this.accountholderIsLinkConsumer;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.accountholderPhoneNumber);
        parcel.writeString(this.accountholderToken);
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        if (financialConnectionsAuthorizationSession == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsAuthorizationSession.writeToParcel(parcel, flags);
        }
        FinancialConnectionsInstitution qVar = this.activeInstitution;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.assignmentEventId);
        parcel.writeString(this.businessName);
        parcel.writeString(this.cancelUrl);
        parcel.writeString(this.connectPlatformName);
        parcel.writeString(this.connectedAccountName);
        Map<String, String> map = this.experimentAssignments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        TextUpdate l0Var = this.displayText;
        if (l0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0Var.writeToParcel(parcel, flags);
        }
        Map<String, Boolean> map2 = this.features;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
            }
        }
        parcel.writeString(this.hostedAuthUrl);
        FinancialConnectionsInstitution qVar2 = this.initialInstitution;
        if (qVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar2.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.isEndUserFacing;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isLinkWithStripe;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isNetworkingUserFlow;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isStripeDirect;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        if (linkAccountSessionCancellationBehavior == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkAccountSessionCancellationBehavior.name());
        }
        Map<String, Boolean> map3 = this.modalCustomization;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map3.size());
            for (Map.Entry<String, Boolean> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeInt(entry3.getValue().booleanValue() ? 1 : 0);
            }
        }
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        if (supportedPaymentMethodTypes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(supportedPaymentMethodTypes.name());
        }
        Boolean bool6 = this.stepUpAuthenticationRequired;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.successUrl);
        Boolean bool7 = this.skipSuccessPane;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Theme theme = this.theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final FinancialConnectionsInstitution getInitialInstitution() {
        return this.initialInstitution;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getInstitutionSearchDisabled() {
        return this.institutionSearchDisabled;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsSessionManifest(boolean z11, boolean z12, boolean z13, boolean z14, String id2, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Pane nextPane, ManualEntryMode manualEntryMode, List<? extends FinancialConnectionsAccount.Permissions> permissions, Product product, boolean z21, boolean z22, AccountDisconnectionMethod accountDisconnectionMethod, String str, Boolean bool, String str2, String str3, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution qVar, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, TextUpdate l0Var, Map<String, Boolean> map2, String str9, FinancialConnectionsInstitution qVar2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map<String, Boolean> map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str10, Boolean bool7, Theme theme) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(nextPane, "nextPane");
        p013kotlin.jvm.internal.s.k(manualEntryMode, "manualEntryMode");
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        p013kotlin.jvm.internal.s.k(product, "product");
        this.allowManualEntry = z11;
        this.consentRequired = z12;
        this.customManualEntryHandling = z13;
        this.disableLinkMoreAccounts = z14;
        this.id = id2;
        this.instantVerificationDisabled = z15;
        this.institutionSearchDisabled = z16;
        this.livemode = z17;
        this.manualEntryUsesMicrodeposits = z18;
        this.mobileHandoffEnabled = z19;
        this.nextPane = nextPane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = permissions;
        this.product = product;
        this.singleAccount = z21;
        this.useSingleSortSearch = z22;
        this.accountDisconnectionMethod = accountDisconnectionMethod;
        this.accountholderCustomerEmailAddress = str;
        this.accountholderIsLinkConsumer = bool;
        this.accountholderPhoneNumber = str2;
        this.accountholderToken = str3;
        this.activeAuthSession = financialConnectionsAuthorizationSession;
        this.activeInstitution = qVar;
        this.assignmentEventId = str4;
        this.businessName = str5;
        this.cancelUrl = str6;
        this.connectPlatformName = str7;
        this.connectedAccountName = str8;
        this.experimentAssignments = map;
        this.displayText = l0Var;
        this.features = map2;
        this.hostedAuthUrl = str9;
        this.initialInstitution = qVar2;
        this.isEndUserFacing = bool2;
        this.isLinkWithStripe = bool3;
        this.isNetworkingUserFlow = bool4;
        this.isStripeDirect = bool5;
        this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        this.modalCustomization = map3;
        this.paymentMethodType = supportedPaymentMethodTypes;
        this.stepUpAuthenticationRequired = bool6;
        this.successUrl = str10;
        this.skipSuccessPane = bool7;
        this.theme = theme;
    }
}
