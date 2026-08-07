package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import ezvcard.property.Gender;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002¨\u0001\b\u0007\u0018\u0000 \u0085\u00022\u00020\u00012\u00020\u0002:\u0002\u0081\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0019\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u000f2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b+\u0010)J\u0019\u0010,\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b,\u0010)J\u001b\u0010/\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0014¢\u0006\u0004\b1\u0010\u0015J\u000f\u00102\u001a\u00020\u000fH\u0014¢\u0006\u0004\b2\u0010\u0015J\u0019\u00104\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010\u000eJ\u000f\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020?H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010\u0011J\u0019\u0010H\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0004\bH\u0010=J\u0017\u0010J\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010:¢\u0006\u0004\bJ\u0010=J\u0019\u0010K\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\bK\u0010%J\u0015\u0010L\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bL\u0010\u0011J\u0019\u0010N\u001a\u00020\u000f2\b\u0010M\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bN\u0010=J#\u0010Q\u001a\u00020\u000f2\b\b\u0001\u0010O\u001a\u00020\u00072\b\b\u0001\u0010P\u001a\u00020\u0007H\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u00020\u000f2\b\u0010S\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bT\u0010=J\u0019\u0010W\u001a\u00020\u000f2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bZ\u0010XJ\u0019\u0010\\\u001a\u00020\u000f2\b\u0010[\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b\\\u0010XJ\u0019\u0010^\u001a\u00020\u000f2\b\u0010]\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b^\u0010XJ\u000f\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b_\u0010\u000eJ\u0017\u0010a\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\tH\u0016¢\u0006\u0004\ba\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010m\u001a\u00020h8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010s\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010y\u001a\u00020t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010\u007f\u001a\u00020z8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R \u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u008a\u0001\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u0090\u0001\u001a\u00030\u008b\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0099\u0001\u001a\u00030\u0091\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0093\u0001\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0093\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010¥\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010¤\u0001R\u001a\u0010§\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010¦\u0001R\u0017\u0010ª\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010©\u0001R\u0016\u0010_\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010cR\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010«\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010«\u0001R&\u0010²\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010c\u001a\u0005\b°\u0001\u0010\u000e\"\u0005\b±\u0001\u0010\u0011R1\u0010¸\u0001\u001a\u00020\t2\u0007\u0010³\u0001\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010\u000e\"\u0005\b·\u0001\u0010\u0011R,\u0010À\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R4\u0010Å\u0001\u001a\u0004\u0018\u00010:2\t\u0010Á\u0001\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b\u0018\u0010«\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010=R5\u0010É\u0001\u001a\u00020\t2\u0007\u0010Á\u0001\u001a\u00020\t8\u0000@@X\u0081\u000e¢\u0006\u001b\n\u0004\b\r\u0010c\u0012\u0005\bÈ\u0001\u0010\u0015\u001a\u0005\bÆ\u0001\u0010\u000e\"\u0005\bÇ\u0001\u0010\u0011R5\u0010Í\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b\u0019\u0010µ\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0005\bÌ\u0001\u0010%R\u0017\u0010Î\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010cR2\u0010Ó\u0001\u001a\u00020&2\u0007\u0010³\u0001\u001a\u00020&8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\bÏ\u0001\u0010µ\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0005\bÒ\u0001\u0010)R1\u0010Ö\u0001\u001a\u00020&2\u0007\u0010³\u0001\u001a\u00020&8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b!\u0010µ\u0001\u001a\u0006\bÔ\u0001\u0010Ñ\u0001\"\u0005\bÕ\u0001\u0010)R1\u0010Ù\u0001\u001a\u00020&2\u0007\u0010³\u0001\u001a\u00020&8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b>\u0010µ\u0001\u001a\u0006\b×\u0001\u0010Ñ\u0001\"\u0005\bØ\u0001\u0010)R6\u0010Ý\u0001\u001a\u0004\u0018\u00010&2\t\u0010³\u0001\u001a\u0004\u0018\u00010&8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\bÚ\u0001\u0010µ\u0001\u001a\u0006\bÛ\u0001\u0010Ñ\u0001\"\u0005\bÜ\u0001\u0010)R\u001a\u0010á\u0001\u001a\u0005\u0018\u00010Þ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u001e\u0010å\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u001f\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0013\u0010\u001b\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010ð\u0001\u001a\u0005\u0018\u00010í\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010ï\u0001R\u001a\u0010ô\u0001\u001a\u0005\u0018\u00010ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0017\u0010ø\u0001\u001a\u0005\u0018\u00010õ\u00018F¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u0017\u0010ü\u0001\u001a\u0005\u0018\u00010ù\u00018F¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u001a\u0010\u0080\u0002\u001a\u0005\u0018\u00010ý\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u001a\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0081\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002¨\u0006\u0086\u0002"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "shouldShowPostalCode", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "y", "()Z", "Ljn0/h0;", "o", "(Z)V", "p", "(Landroid/util/AttributeSet;)V", "q", "()V", "r", "s", "x", "z", "Lcom/stripe/android/model/h;", "brand", "A", "(Lcom/stripe/android/model/h;)V", "Lcom/stripe/android/view/StripeEditText;", "editText", "iconResourceId", "C", "(Lcom/stripe/android/view/StripeEditText;I)V", "resId", "setExpirationDatePlaceholderRes", "(Ljava/lang/Integer;)V", "Lcom/stripe/android/view/StripeEditText$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCardNumberErrorListener", "(Lcom/stripe/android/view/StripeEditText$c;)V", "setExpirationDateErrorListener", "setCvcErrorListener", "setPostalCodeErrorListener", "", "preferredNetworks", "setPreferredNetworks", "(Ljava/util/List;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/stripe/android/view/f0;", "setCardInputListener", "(Lcom/stripe/android/view/f0;)V", "Lcom/stripe/android/view/x0;", "callback", "setCardValidCallback", "(Lcom/stripe/android/view/x0;)V", "", "cardHint", "setCardHint", "(Ljava/lang/String;)V", "D", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "hasWindowFocus", "onWindowFocusChanged", "cvcPlaceholderText", "setCvcPlaceholderText", "cvcLabel", "setCvcLabel", "setCvcIcon", "setShouldShowPostalCode", "cardNumber", "setCardNumber", "month", "year", "setExpiryDate", "(II)V", "cvcCode", "setCvcCode", "Landroid/text/TextWatcher;", "cardNumberTextWatcher", "setCardNumberTextWatcher", "(Landroid/text/TextWatcher;)V", "expiryDateTextWatcher", "setExpiryDateTextWatcher", "cvcNumberTextWatcher", "setCvcNumberTextWatcher", "postalCodeTextWatcher", "setPostalCodeTextWatcher", "isEnabled", "enabled", "setEnabled", "a", "Z", "Lh40/m;", "b", "Lh40/m;", "viewBinding", "Lcom/stripe/android/view/CardNumberEditText;", "c", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText", "()Lcom/stripe/android/view/CardNumberEditText;", "cardNumberEditText", "Lcom/stripe/android/view/CardBrandView;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "cardBrandView", "Lcom/stripe/android/view/ExpiryDateEditText;", "e", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText", "()Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateEditText", "Lcom/stripe/android/view/CvcEditText;", "f", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText", "()Lcom/stripe/android/view/CvcEditText;", "cvcEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "g", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeEditText", "h", "Landroid/widget/LinearLayout;", "getSecondRowLayout", "()Landroid/widget/LinearLayout;", "secondRowLayout", "Lcom/stripe/android/view/CardNumberTextInputLayout;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/view/CardNumberTextInputLayout;", "getCardNumberTextInputLayout", "()Lcom/stripe/android/view/CardNumberTextInputLayout;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "j", "Lcom/google/android/material/textfield/TextInputLayout;", "getExpiryTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "expiryTextInputLayout", "k", "getCvcInputLayout", "cvcInputLayout", "l", "getPostalInputLayout$payments_core_release", "postalInputLayout", "Lcom/stripe/android/view/r1;", "m", "Lcom/stripe/android/view/r1;", "lifecycleDelegate", "n", "Ljava/util/List;", "textInputLayouts", "Lcom/stripe/android/view/f0;", "cardInputListener", "Lcom/stripe/android/view/x0;", "cardValidCallback", "com/stripe/android/view/CardMultilineWidget$i", "Lcom/stripe/android/view/CardMultilineWidget$i;", "cardValidTextWatcher", "Ljava/lang/String;", "customCvcLabel", "t", "customCvcPlaceholderText", "u", "getPostalCodeRequired", "setPostalCodeRequired", "postalCodeRequired", "<set-?>", "v", "Lkotlin/properties/d;", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired", "Landroidx/lifecycle/f1;", "w", "Landroidx/lifecycle/f1;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/f1;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/f1;)V", "viewModelStoreOwner", "value", "getOnBehalfOf", "()Ljava/lang/String;", "setOnBehalfOf", "onBehalfOf", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon$payments_core_release", "getShouldShowErrorIcon$payments_core_release$annotations", "shouldShowErrorIcon", "getExpirationDatePlaceholderRes$payments_core_release", "()Ljava/lang/Integer;", "setExpirationDatePlaceholderRes$payments_core_release", "expirationDatePlaceholderRes", "showCvcIconInCvcField", "B", "getCardNumberErrorListener$payments_core_release", "()Lcom/stripe/android/view/StripeEditText$c;", "setCardNumberErrorListener$payments_core_release", "cardNumberErrorListener", "getExpirationDateErrorListener$payments_core_release", "setExpirationDateErrorListener$payments_core_release", "expirationDateErrorListener", "getCvcErrorListener$payments_core_release", "setCvcErrorListener$payments_core_release", "cvcErrorListener", "E", "getPostalCodeErrorListener$payments_core_release", "setPostalCodeErrorListener$payments_core_release", "postalCodeErrorListener", "Lcom/stripe/android/model/k0$b;", "getExpirationDate", "()Lcom/stripe/android/model/k0$b;", "expirationDate", "", "getAllFields", "()Ljava/util/Collection;", "allFields", "", "Lcom/stripe/android/view/x0$a;", "getInvalidFields$payments_core_release", "()Ljava/util/Set;", "invalidFields", "getBrand", "()Lcom/stripe/android/model/h;", "Lcom/stripe/android/model/w0$c;", "getPaymentMethodCard", "()Lcom/stripe/android/model/w0$c;", "paymentMethodCard", "Lcom/stripe/android/model/w0;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/v0$e;", "getPaymentMethodBillingDetails", "()Lcom/stripe/android/model/v0$e;", "paymentMethodBillingDetails", "Lcom/stripe/android/model/v0$e$a;", "getPaymentMethodBillingDetailsBuilder", "()Lcom/stripe/android/model/v0$e$a;", "paymentMethodBillingDetailsBuilder", "Lcom/stripe/android/model/k;", "getCardParams", "()Lcom/stripe/android/model/k;", "cardParams", "Lh30/f$c;", "getValidatedCardNumber$payments_core_release", "()Lh30/f$c;", "validatedCardNumber", Gender.FEMALE, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardMultilineWidget extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean showCvcIconInCvcField;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final p013kotlin.properties.d cardNumberErrorListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final p013kotlin.properties.d expirationDateErrorListener;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final p013kotlin.properties.d cvcErrorListener;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final p013kotlin.properties.d postalCodeErrorListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowPostalCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h40.m viewBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CardNumberEditText cardNumberEditText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CardBrandView cardBrandView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ExpiryDateEditText expiryDateEditText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CvcEditText cvcEditText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final PostalCodeEditText postalCodeEditText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final LinearLayout secondRowLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CardNumberTextInputLayout cardNumberTextInputLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout expiryTextInputLayout;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout cvcInputLayout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout postalInputLayout;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final r1 lifecycleDelegate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List<TextInputLayout> textInputLayouts;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private f0 cardInputListener;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private x0 cardValidCallback;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final i cardValidTextWatcher;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private String customCvcLabel;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String customCvcPlaceholderText;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean postalCodeRequired;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d usZipCodeRequired;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private androidx.p003lifecycle.f1 viewModelStoreOwner;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String onBehalfOf;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowErrorIcon;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d expirationDatePlaceholderRes;
    static final /* synthetic */ co0.m<Object>[] G = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};
    private static final g F = new g(null);
    public static final int H = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, jn0.h0> {
        a() {
            super(1);
        }

        public final void a(boolean z11) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Boolean bool) {
            a(bool.booleanValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        b() {
            super(0);
        }

        public final void b() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            f0 f0Var = CardMultilineWidget.this.cardInputListener;
            if (f0Var != null) {
                f0Var.e();
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "brand", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, jn0.h0> {
        c() {
            super(1);
        }

        public final void a(com.stripe.android.model.h brand) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            CardMultilineWidget.this.getCardBrandView().setBrand(brand);
            CardMultilineWidget.this.z();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(com.stripe.android.model.h hVar) {
            a(hVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "brand", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, jn0.h0> {
        d() {
            super(1);
        }

        public final void a(com.stripe.android.model.h brand) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            CardMultilineWidget.this.A(brand);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(com.stripe.android.model.h hVar) {
            a(hVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/h;", "brands", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends com.stripe.android.model.h>, jn0.h0> {
        e() {
            super(1);
        }

        public final void a(List<? extends com.stripe.android.model.h> brands) {
            p013kotlin.jvm.internal.s.k(brands, "brands");
            com.stripe.android.model.h brand = CardMultilineWidget.this.getCardBrandView().getBrand();
            CardMultilineWidget.this.getCardBrandView().setPossibleBrands(brands);
            if (!brands.contains(brand)) {
                CardMultilineWidget.this.getCardBrandView().setBrand(com.stripe.android.model.h.Unknown);
            }
            com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.q0(brands);
            if (hVar == null) {
                hVar = com.stripe.android.model.h.Unknown;
            }
            CardMultilineWidget.this.A(hVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(List<? extends com.stripe.android.model.h> list) {
            a(list);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        f() {
            super(0);
        }

        public final void b() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            f0 f0Var = CardMultilineWidget.this.cardInputListener;
            if (f0Var != null) {
                f0Var.b();
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget$g;", "", "<init>", "()V", "", "CARD_MULTILINE_TOKEN", "Ljava/lang/String;", "STATE_ON_BEHALF_OF", "STATE_REMAINING_STATE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class g {
        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            CardMultilineWidget.this.setShouldShowErrorIcon$payments_core_release(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/view/CardMultilineWidget$i", "Lcom/stripe/android/view/v2;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends v2 {
        i() {
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            super.afterTextChanged(s11);
            x0 x0Var = CardMultilineWidget.this.cardValidCallback;
            if (x0Var != null) {
                x0Var.a(CardMultilineWidget.this.getInvalidFields$payments_core_release().isEmpty(), CardMultilineWidget.this.getInvalidFields$payments_core_release());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Lcom/stripe/android/view/a1;", "viewModel", "Ljn0/h0;", "a", "(Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/a1;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.p<LifecycleOwner, a1, jn0.h0> {

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.view.CardMultilineWidget$onAttachedToWindow$1$invoke$$inlined$launchAndCollect$default$1", f = "CardMultilineWidget.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f54495n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f54496o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f54497p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Flow f54498q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ CardMultilineWidget f54499r;

            /* JADX INFO: renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.view.CardMultilineWidget$onAttachedToWindow$1$invoke$$inlined$launchAndCollect$default$1$1", f = "CardMultilineWidget.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1093a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f54500n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Flow f54501o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ CardMultilineWidget f54502p;

                /* JADX INFO: renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class C1094a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardMultilineWidget f54503a;

                    public C1094a(CardMultilineWidget cardMultilineWidget) {
                        this.f54503a = cardMultilineWidget;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t11, Continuation<? super jn0.h0> continuation) {
                        this.f54503a.getCardBrandView().setCbcEligible(((Boolean) t11).booleanValue());
                        return jn0.h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1093a(Flow flow, Continuation continuation, CardMultilineWidget cardMultilineWidget) {
                    super(2, continuation);
                    this.f54501o = flow;
                    this.f54502p = cardMultilineWidget;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new C1093a(this.f54501o, continuation, this.f54502p);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f54500n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        Flow flow = this.f54501o;
                        C1094a c1094a = new C1094a(this.f54502p);
                        this.f54500n = 1;
                        if (flow.collect(c1094a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    return jn0.h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((C1093a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow flow, Continuation continuation, CardMultilineWidget cardMultilineWidget) {
                super(2, continuation);
                this.f54497p = state;
                this.f54498q = flow;
                this.f54499r = cardMultilineWidget;
                this.f54496o = lifecycleOwner;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f54496o, this.f54497p, this.f54498q, continuation, this.f54499r);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f54495n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f54496o;
                    Lifecycle.State state = this.f54497p;
                    C1093a c1093a = new C1093a(this.f54498q, null, this.f54499r);
                    this.f54495n = 1;
                    if (androidx.p003lifecycle.p0.b(lifecycleOwner, state, c1093a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        j() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, a1 viewModel) {
            p013kotlin.jvm.internal.s.k(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            if (CardMultilineWidget.this.getOnBehalfOf() != null && !p013kotlin.jvm.internal.s.f(viewModel.get_onBehalfOf(), CardMultilineWidget.this.getOnBehalfOf())) {
                viewModel.j(CardMultilineWidget.this.getOnBehalfOf());
            }
            StateFlow<Boolean> stateFlowI = viewModel.i();
            CardMultilineWidget cardMultilineWidget = CardMultilineWidget.this;
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowI, null, cardMultilineWidget), 3, null);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(LifecycleOwner lifecycleOwner, a1 a1Var) {
            a(lifecycleOwner, a1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Lcom/stripe/android/view/a1;", "viewModel", "Ljn0/h0;", "a", "(Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/a1;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.p<LifecycleOwner, a1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f54504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(2);
            this.f54504c = str;
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, a1 viewModel) {
            p013kotlin.jvm.internal.s.k(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            viewModel.j(this.f54504c);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(LifecycleOwner lifecycleOwner, a1 a1Var) {
            a(lifecycleOwner, a1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardMultilineWidget$l", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends ObservableProperty<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f54505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f54505a = cardMultilineWidget;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Boolean oldValue, Boolean newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            boolean zBooleanValue = newValue.booleanValue();
            oldValue.getClass();
            if (zBooleanValue) {
                this.f54505a.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.b.US);
            } else {
                this.f54505a.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.b.Global);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardMultilineWidget$m", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends ObservableProperty<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f54506a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f54506a = cardMultilineWidget;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            String string;
            p013kotlin.jvm.internal.s.k(property, "property");
            Integer num = newValue;
            TextInputLayout expiryTextInputLayout = this.f54506a.getExpiryTextInputLayout();
            if (num != null) {
                string = this.f54506a.getResources().getString(num.intValue());
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            expiryTextInputLayout.setPlaceholderText(string);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardMultilineWidget$n", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends ObservableProperty<StripeEditText.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f54507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f54507a = cardMultilineWidget;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, StripeEditText.c oldValue, StripeEditText.c newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.f54507a.getCardNumberEditText().setErrorMessageListener(newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardMultilineWidget$o", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends ObservableProperty<StripeEditText.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f54508a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f54508a = cardMultilineWidget;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, StripeEditText.c oldValue, StripeEditText.c newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.f54508a.getExpiryDateEditText().setErrorMessageListener(newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardMultilineWidget$p", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends ObservableProperty<StripeEditText.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f54509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f54509a = cardMultilineWidget;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, StripeEditText.c oldValue, StripeEditText.c newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.f54509a.getCvcEditText().setErrorMessageListener(newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardMultilineWidget$q", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends ObservableProperty<StripeEditText.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f54510a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f54510a = cardMultilineWidget;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, StripeEditText.c oldValue, StripeEditText.c newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.f54510a.getPostalCodeEditText().setErrorMessageListener(newValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context) {
        this(context, null, 0, false, 14, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(com.stripe.android.model.h brand) {
        this.cvcEditText.r(brand, this.customCvcLabel, this.customCvcPlaceholderText, this.cvcInputLayout);
    }

    static /* synthetic */ void B(CardMultilineWidget cardMultilineWidget, com.stripe.android.model.h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.A(hVar);
    }

    private final void C(StripeEditText editText, int iconResourceId) {
        Drawable drawable = androidx.core.content.b.getDrawable(getContext(), iconResourceId);
        if (drawable != null) {
            editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private final Collection<StripeEditText> getAllFields() {
        return p013kotlin.collections.d1.i(this.cardNumberEditText, this.expiryDateEditText, this.cvcEditText, this.postalCodeEditText);
    }

    private final com.stripe.android.model.k0.Validated getExpirationDate() {
        return this.expiryDateEditText.getValidatedDate();
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CardMultilineWidget this$0, String text) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(text, "text");
        com.stripe.android.model.h implicitCardBrandForCbc = this$0.cardNumberEditText.getImplicitCardBrandForCbc();
        if (implicitCardBrandForCbc == com.stripe.android.model.h.Unknown) {
            implicitCardBrandForCbc = null;
        }
        if (implicitCardBrandForCbc == null) {
            implicitCardBrandForCbc = this$0.cardNumberEditText.getCardBrand();
        }
        if (implicitCardBrandForCbc.isMaxCvc(text)) {
            this$0.z();
            if (this$0.shouldShowPostalCode) {
                this$0.postalCodeEditText.requestFocus();
            }
            f0 f0Var = this$0.cardInputListener;
            if (f0Var != null) {
                f0Var.a();
            }
        } else if (!this$0.showCvcIconInCvcField) {
            this$0.q();
        }
        this$0.cvcEditText.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardMultilineWidget this$0, String it) {
        f0 f0Var;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(it, "it");
        if (this$0.y() && this$0.postalCodeEditText.q() && (f0Var = this$0.cardInputListener) != null) {
            f0Var.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(int i11, CardMultilineWidget this$0, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        int width = view.getWidth() + i11;
        CardNumberEditText cardNumberEditText = this$0.cardNumberEditText;
        cardNumberEditText.setPadding(cardNumberEditText.getPaddingLeft(), cardNumberEditText.getPaddingTop(), width, cardNumberEditText.getPaddingBottom());
    }

    private final void o(boolean shouldShowPostalCode) {
        this.expiryTextInputLayout.setHint(getResources().getString(shouldShowPostalCode ? f30.d0.f63961n0 : f30.d0.f63940d));
        int i11 = shouldShowPostalCode ? f30.z.N : -1;
        this.cvcEditText.setNextFocusForwardId(i11);
        this.cvcEditText.setNextFocusDownId(i11);
        int i12 = shouldShowPostalCode ? 0 : 8;
        this.postalInputLayout.setVisibility(i12);
        this.cvcEditText.setImeOptions(i12 == 8 ? 6 : 5);
        TextInputLayout textInputLayout = this.cvcInputLayout;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(shouldShowPostalCode ? getResources().getDimensionPixelSize(f30.x.f64208a) : 0);
        textInputLayout.setLayoutParams(layoutParams2);
    }

    private final void p(AttributeSet attrs) {
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        int[] CardElement = f30.f0.f63996c;
        p013kotlin.jvm.internal.s.j(CardElement, "CardElement");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardElement, 0, 0);
        this.shouldShowPostalCode = typedArrayObtainStyledAttributes.getBoolean(f30.f0.f63999f, this.shouldShowPostalCode);
        this.postalCodeRequired = typedArrayObtainStyledAttributes.getBoolean(f30.f0.f63997d, this.postalCodeRequired);
        setUsZipCodeRequired(typedArrayObtainStyledAttributes.getBoolean(f30.f0.f63998e, getUsZipCodeRequired()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void q() {
        if (getBrand().isMaxCvc(this.cvcEditText.getFieldText$payments_core_release())) {
            return;
        }
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    private final void r() {
        this.expiryDateEditText.setDeleteEmptyListener(new com.stripe.android.view.o(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new com.stripe.android.view.o(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new com.stripe.android.view.o(this.cvcEditText));
    }

    private final void s() {
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.r0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.t(this.f55140a, view, z11);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.s0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.u(this.f55163a, view, z11);
            }
        });
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.t0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.v(this.f55173a, view, z11);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.u0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.w(this.f55180a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CardMultilineWidget this$0, View view, boolean z11) {
        f0 f0Var;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!z11 || (f0Var = this$0.cardInputListener) == null) {
            return;
        }
        f0Var.d(f0.a.CardNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(CardMultilineWidget this$0, View view, boolean z11) {
        f0 f0Var;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!z11 || (f0Var = this$0.cardInputListener) == null) {
            return;
        }
        f0Var.d(f0.a.ExpiryDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CardMultilineWidget this$0, View view, boolean z11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!z11) {
            this$0.cardBrandView.setShouldShowErrorIcon(this$0.shouldShowErrorIcon);
            return;
        }
        if (!this$0.showCvcIconInCvcField) {
            this$0.q();
        }
        f0 f0Var = this$0.cardInputListener;
        if (f0Var != null) {
            f0Var.d(f0.a.Cvc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(CardMultilineWidget this$0, View view, boolean z11) {
        f0 f0Var;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (this$0.shouldShowPostalCode && z11 && (f0Var = this$0.cardInputListener) != null) {
            f0Var.d(f0.a.PostalCode);
        }
    }

    private final void x() {
        this.cardNumberEditText.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.expiryDateEditText.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.cvcEditText.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.postalCodeEditText.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    private final boolean y() {
        return (this.postalCodeRequired || getUsZipCodeRequired()) && this.shouldShowPostalCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        B(this, null, 1, null);
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    public final boolean D() {
        String postalCode$payments_core_release;
        Object next;
        boolean z11 = getValidatedCardNumber$payments_core_release() != null;
        boolean z12 = getExpirationDate() != null;
        boolean z13 = this.cvcEditText.getCvc$payments_core_release() != null;
        this.cardNumberEditText.setShouldShowError(!z11);
        this.expiryDateEditText.setShouldShowError(!z12);
        this.cvcEditText.setShouldShowError(!z13);
        this.postalCodeEditText.setShouldShowError((this.postalCodeRequired || getUsZipCodeRequired()) && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || p013kotlin.text.t.y0(postalCode$payments_core_release)));
        Iterator<T> it = getAllFields().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((StripeEditText) next).getShouldShowError());
        StripeEditText stripeEditText = (StripeEditText) next;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        return z11 && z12 && z13 && !this.postalCodeEditText.getShouldShowError();
    }

    public final /* synthetic */ com.stripe.android.model.h getBrand() {
        return this.cardBrandView.getBrand();
    }

    /* JADX INFO: renamed from: getCardBrandView$payments_core_release, reason: from getter */
    public final CardBrandView getCardBrandView() {
        return this.cardBrandView;
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    public final StripeEditText.c getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.c) this.cardNumberErrorListener.getValue(this, G[2]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.cardNumberTextInputLayout;
    }

    public CardParams getCardParams() {
        String str = null;
        if (!D()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        com.stripe.android.model.k0.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Editable text = this.cvcEditText.getText();
        String string = text != null ? text.toString() : null;
        Editable text2 = this.postalCodeEditText.getText();
        String string2 = text2 != null ? text2.toString() : null;
        if (!this.shouldShowPostalCode) {
            string2 = null;
        }
        com.stripe.android.model.h brand = getBrand();
        Set setC = p013kotlin.collections.d1.c("CardMultilineView");
        h30.f.Validated validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
        String value = validatedCardNumber$payments_core_release != null ? validatedCardNumber$payments_core_release.getValue() : null;
        if (value == null) {
            value = "";
        }
        String str2 = value;
        int month = validatedDate.getMonth();
        int year = validatedDate.getYear();
        Address.a aVar = new Address.a();
        if (string2 != null && !p013kotlin.text.t.y0(string2)) {
            str = string2;
        }
        return new CardParams(brand, setC, str2, month, year, string, null, aVar.g(str).a(), null, this.cardBrandView.e(), null, 1344, null);
    }

    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    public final StripeEditText.c getCvcErrorListener$payments_core_release() {
        return (StripeEditText.c) this.cvcErrorListener.getValue(this, G[4]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.cvcInputLayout;
    }

    public final StripeEditText.c getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.c) this.expirationDateErrorListener.getValue(this, G[3]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.expirationDatePlaceholderRes.getValue(this, G[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.expiryTextInputLayout;
    }

    public final Set<x0.a> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        x0.a aVar = x0.a.Number;
        x0.a aVar2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            aVar = null;
        }
        x0.a aVar3 = x0.a.Expiry;
        if (getExpirationDate() != null) {
            aVar3 = null;
        }
        x0.a aVar4 = x0.a.Cvc;
        if (this.cvcEditText.getCvc$payments_core_release() != null) {
            aVar4 = null;
        }
        x0.a aVar5 = x0.a.Postal;
        if (y() && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || p013kotlin.text.t.y0(postalCode$payments_core_release))) {
            aVar2 = aVar5;
        }
        return p013kotlin.collections.v.r1(p013kotlin.collections.v.r(aVar, aVar3, aVar4, aVar2));
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final PaymentMethod.BillingDetails getPaymentMethodBillingDetails() {
        PaymentMethod.BillingDetails.a paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.a();
        }
        return null;
    }

    public final PaymentMethod.BillingDetails.a getPaymentMethodBillingDetailsBuilder() {
        if (this.shouldShowPostalCode && D()) {
            return new PaymentMethod.BillingDetails.a().b(new Address.a().g(this.postalCodeEditText.getPostalCode$payments_core_release()).a());
        }
        return null;
    }

    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        String number = cardParams.getNumber();
        String cvc = cardParams.getCvc();
        int expMonth = cardParams.getExpMonth();
        int expYear = cardParams.getExpYear();
        return new PaymentMethodCreateParams.Card(number, Integer.valueOf(expMonth), Integer.valueOf(expYear), cvc, null, cardParams.a(), this.cardBrandView.l(), 16, null);
    }

    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.j(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, getPaymentMethodBillingDetails(), null, null, 12, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: getPostalCodeEditText$payments_core_release, reason: from getter */
    public final PostalCodeEditText getPostalCodeEditText() {
        return this.postalCodeEditText;
    }

    public final StripeEditText.c getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.c) this.postalCodeErrorListener.getValue(this, G[5]);
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    /* JADX INFO: renamed from: getPostalInputLayout$payments_core_release, reason: from getter */
    public final TextInputLayout getPostalInputLayout() {
        return this.postalInputLayout;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.secondRowLayout;
    }

    /* JADX INFO: renamed from: getShouldShowErrorIcon$payments_core_release, reason: from getter */
    public final boolean getShouldShowErrorIcon() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired.getValue(this, G[0])).booleanValue();
    }

    public final h30.f.Validated getValidatedCardNumber$payments_core_release() {
        return this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
    }

    /* JADX INFO: renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final androidx.p003lifecycle.f1 getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cvcEditText.setHint((CharSequence) null);
        this.lifecycleDelegate.c(this);
        b1.a(this, this.viewModelStoreOwner, new j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleDelegate.b(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        setOnBehalfOf(bundle.getString("state_on_behalf_of"));
        super.onRestoreInstanceState(bundle.getParcelable("state_remaining_state"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return q5.d.b(jn0.x.a("state_remaining_state", super.onSaveInstanceState()), jn0.x.a("state_on_behalf_of", this.onBehalfOf));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            z();
        }
    }

    public void setCardHint(String cardHint) {
        p013kotlin.jvm.internal.s.k(cardHint, "cardHint");
        this.cardNumberTextInputLayout.setPlaceholderText(cardHint);
    }

    public void setCardInputListener(f0 listener) {
        this.cardInputListener = listener;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumberEditText.setText(cardNumber);
    }

    public final void setCardNumberErrorListener(StripeEditText.c listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<set-?>");
        this.cardNumberErrorListener.setValue(this, G[2], cVar);
    }

    public void setCardNumberTextWatcher(TextWatcher cardNumberTextWatcher) {
        this.cardNumberEditText.addTextChangedListener(cardNumberTextWatcher);
    }

    public void setCardValidCallback(x0 callback) {
        this.cardValidCallback = callback;
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (callback != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        x0 x0Var = this.cardValidCallback;
        if (x0Var != null) {
            x0Var.a(getInvalidFields$payments_core_release().isEmpty(), getInvalidFields$payments_core_release());
        }
    }

    public void setCvcCode(String cvcCode) {
        this.cvcEditText.setText(cvcCode);
    }

    public final void setCvcErrorListener(StripeEditText.c listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<set-?>");
        this.cvcErrorListener.setValue(this, G[4], cVar);
    }

    public final /* synthetic */ void setCvcIcon(Integer resId) {
        if (resId != null) {
            C(this.cvcEditText, resId.intValue());
        }
        this.showCvcIconInCvcField = resId != null;
    }

    public final void setCvcLabel(String cvcLabel) {
        this.customCvcLabel = cvcLabel;
        B(this, null, 1, null);
    }

    public void setCvcNumberTextWatcher(TextWatcher cvcNumberTextWatcher) {
        this.cvcEditText.addTextChangedListener(cvcNumberTextWatcher);
    }

    public final void setCvcPlaceholderText(String cvcPlaceholderText) {
        this.customCvcPlaceholderText = cvcPlaceholderText;
        B(this, null, 1, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<T> it = this.textInputLayouts.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(enabled);
        }
        this.isEnabled = enabled;
    }

    public final void setExpirationDateErrorListener(StripeEditText.c listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<set-?>");
        this.expirationDateErrorListener.setValue(this, G[3], cVar);
    }

    public final void setExpirationDatePlaceholderRes(Integer resId) {
        setExpirationDatePlaceholderRes$payments_core_release(resId);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.expirationDatePlaceholderRes.setValue(this, G[1], num);
    }

    public void setExpiryDate(int month, int year) {
        this.expiryDateEditText.setText(new com.stripe.android.model.k0.Unvalidated(month, year).b());
    }

    public void setExpiryDateTextWatcher(TextWatcher expiryDateTextWatcher) {
        this.expiryDateEditText.addTextChangedListener(expiryDateTextWatcher);
    }

    public final void setOnBehalfOf(String str) {
        if (p013kotlin.jvm.internal.s.f(this.onBehalfOf, str)) {
            return;
        }
        if (isAttachedToWindow()) {
            b1.a(this, this.viewModelStoreOwner, new k(str));
        }
        this.onBehalfOf = str;
    }

    public final void setPostalCodeErrorListener(StripeEditText.c listener) {
        setPostalCodeErrorListener$payments_core_release(listener);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.c cVar) {
        this.postalCodeErrorListener.setValue(this, G[5], cVar);
    }

    public final void setPostalCodeRequired(boolean z11) {
        this.postalCodeRequired = z11;
    }

    public void setPostalCodeTextWatcher(TextWatcher postalCodeTextWatcher) {
        this.postalCodeEditText.addTextChangedListener(postalCodeTextWatcher);
    }

    public final void setPreferredNetworks(List<? extends com.stripe.android.model.h> preferredNetworks) {
        p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
        this.cardBrandView.setMerchantPreferredNetworks(preferredNetworks);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z11) {
        boolean z12 = this.shouldShowErrorIcon != z11;
        this.shouldShowErrorIcon = z11;
        if (z12) {
            z();
        }
    }

    public final void setShouldShowPostalCode(boolean shouldShowPostalCode) {
        this.shouldShowPostalCode = shouldShowPostalCode;
        o(shouldShowPostalCode);
    }

    public final void setUsZipCodeRequired(boolean z11) {
        this.usZipCodeRequired.setValue(this, G[0], Boolean.valueOf(z11));
    }

    public final void setViewModelStoreOwner$payments_core_release(androidx.p003lifecycle.f1 f1Var) {
        this.viewModelStoreOwner = f1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false, 8, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? true : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.shouldShowPostalCode = z11;
        h40.m mVarB = h40.m.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(mVarB, "inflate(...)");
        this.viewBinding = mVarB;
        CardNumberEditText etCardNumber = mVarB.f70728d;
        p013kotlin.jvm.internal.s.j(etCardNumber, "etCardNumber");
        this.cardNumberEditText = etCardNumber;
        CardBrandView cardBrandView = mVarB.f70726b;
        p013kotlin.jvm.internal.s.j(cardBrandView, "cardBrandView");
        this.cardBrandView = cardBrandView;
        ExpiryDateEditText etExpiry = mVarB.f70730f;
        p013kotlin.jvm.internal.s.j(etExpiry, "etExpiry");
        this.expiryDateEditText = etExpiry;
        CvcEditText etCvc = mVarB.f70729e;
        p013kotlin.jvm.internal.s.j(etCvc, "etCvc");
        this.cvcEditText = etCvc;
        PostalCodeEditText etPostalCode = mVarB.f70731g;
        p013kotlin.jvm.internal.s.j(etPostalCode, "etPostalCode");
        this.postalCodeEditText = etPostalCode;
        LinearLayout secondRowLayout = mVarB.f70732h;
        p013kotlin.jvm.internal.s.j(secondRowLayout, "secondRowLayout");
        this.secondRowLayout = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = mVarB.f70733i;
        p013kotlin.jvm.internal.s.j(tlCardNumber, "tlCardNumber");
        this.cardNumberTextInputLayout = tlCardNumber;
        TextInputLayout tlExpiry = mVarB.f70735k;
        p013kotlin.jvm.internal.s.j(tlExpiry, "tlExpiry");
        this.expiryTextInputLayout = tlExpiry;
        TextInputLayout tlCvc = mVarB.f70734j;
        p013kotlin.jvm.internal.s.j(tlCvc, "tlCvc");
        this.cvcInputLayout = tlCvc;
        TextInputLayout tlPostalCode = mVarB.f70736l;
        p013kotlin.jvm.internal.s.j(tlPostalCode, "tlPostalCode");
        this.postalInputLayout = tlPostalCode;
        this.lifecycleDelegate = new r1();
        List<TextInputLayout> listP = p013kotlin.collections.v.p(tlCardNumber, tlExpiry, tlCvc, tlPostalCode);
        this.textInputLayouts = listP;
        this.cardValidTextWatcher = new i();
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.usZipCodeRequired = new l(Boolean.FALSE, this);
        this.expirationDatePlaceholderRes = new m(Integer.valueOf(f30.d0.f63959m0), this);
        this.cardNumberErrorListener = new n(new m1(tlCardNumber), this);
        this.expirationDateErrorListener = new o(new m1(tlExpiry), this);
        this.cvcErrorListener = new p(new m1(tlCvc), this);
        this.postalCodeErrorListener = new q(new m1(tlPostalCode), this);
        setOrientation(1);
        Iterator<T> it = listP.iterator();
        while (true) {
            ColorStateList hintTextColors = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout = (TextInputLayout) it.next();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                hintTextColors = editText.getHintTextColors();
            }
            textInputLayout.setPlaceholderTextColor(hintTextColors);
        }
        p(attributeSet);
        x();
        s();
        r();
        this.cardBrandView.setTintColorInt$payments_core_release(this.cardNumberEditText.getHintTextColors().getDefaultColor());
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new b());
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new c());
        this.cardNumberEditText.setImplicitCardBrandChangeCallback$payments_core_release(new d());
        this.cardNumberEditText.setPossibleCardBrandsCallback$payments_core_release(new e());
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new f());
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.o0
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.h(this.f55103a, str);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.p0
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.i(this.f55107a, str);
            }
        });
        o(this.shouldShowPostalCode);
        CardNumberEditText.C(this.cardNumberEditText, 0, 1, null);
        z();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new h());
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new a());
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.b.Global);
        this.isEnabled = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(f30.x.f64210c);
        this.cardBrandView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.q0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CardMultilineWidget.j(dimensionPixelSize, this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }
}
