package expo.modules.calendar;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import co0.d;
import co0.q;
import com.facebook.react.bridge.BaseJavaModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.calendar.dialogs.CreateEventIntentResult;
import expo.modules.calendar.dialogs.CreatedEventOptions;
import expo.modules.calendar.dialogs.ViewEventIntentResult;
import expo.modules.calendar.dialogs.ViewedEventOptions;
import expo.modules.contacts.Columns;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.errors.InvalidArgumentException;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 d2\u00020\u0001:\u0001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010\"J\u0017\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0013H\u0002¢\u0006\u0004\b-\u0010&J#\u0010/\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020 2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020 H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:2\u0006\u0010\u0017\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b=\u00106J\u0017\u0010>\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b>\u00108J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b?\u00106J\u0017\u0010@\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b@\u00108J!\u0010B\u001a\u0004\u0018\u00010\u00132\u0006\u00104\u001a\u0002032\u0006\u0010A\u001a\u00020\u0013H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00132\u0006\u00104\u001a\u0002032\u0006\u0010A\u001a\u00020\u0013H\u0002¢\u0006\u0004\bD\u0010CJ\u001f\u0010E\u001a\u00020 2\u0006\u00104\u001a\u0002032\u0006\u0010A\u001a\u00020\u0013H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010L\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u0010H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010W\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010[\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010XR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001c\u0010c\u001a\n `*\u0004\u0018\u00010_0_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lexpo/modules/calendar/CalendarModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function0;", "Ljn0/h0;", "block", "launchAsyncWithModuleScope", "(Lexpo/modules/kotlin/Promise;Lwn0/a;)V", "withPermissions", "", "Landroid/os/Bundle;", "findCalendars", "()Ljava/util/List;", "", "startDate", "endDate", "", "calendars", "findEvents", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", "eventID", "findEventById", "(Ljava/lang/String;)Landroid/os/Bundle;", "calendarID", "findCalendarById", "findAttendeesByEventId", "(Ljava/lang/String;)Ljava/util/List;", "Lexpo/modules/core/arguments/ReadableArguments;", "details", "", "saveCalendar", "(Lexpo/modules/core/arguments/ReadableArguments;)I", "calendarId", "", "deleteCalendar", "(Ljava/lang/String;)Z", "saveEvent", "removeEvent", "(Lexpo/modules/core/arguments/ReadableArguments;)Z", "saveAttendeeForEvent", "(Lexpo/modules/core/arguments/ReadableArguments;Ljava/lang/String;)I", "attendeeID", "deleteAttendee", "reminders", "createRemindersForEvent", "(ILjava/util/List;)V", "removeRemindersForEvent", "(I)V", "Landroid/database/Cursor;", "cursor", "serializeEvents", "(Landroid/database/Cursor;)Ljava/util/List;", "serializeEvent", "(Landroid/database/Cursor;)Landroid/os/Bundle;", "", "Ljava/util/ArrayList;", "serializeAlarms", "(J)Ljava/util/ArrayList;", "serializeEventCalendars", "serializeEventCalendar", "serializeAttendees", "serializeAttendee", "columnName", "optStringFromCursor", "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;", "stringFromCursor", "optIntFromCursor", "(Landroid/database/Cursor;Ljava/lang/String;)I", "checkPermissions", "(Lexpo/modules/kotlin/Promise;)Z", "Ljava/util/Calendar;", "calendar", InquiryField.DateField.TYPE, "setDateInCalendar", "(Ljava/util/Calendar;Ljava/lang/Object;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lkotlinx/coroutines/CoroutineScope;", "moduleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/calendar/dialogs/CreatedEventOptions;", "Lexpo/modules/calendar/dialogs/CreateEventIntentResult;", "createEventLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/calendar/dialogs/ViewedEventOptions;", "Lexpo/modules/calendar/dialogs/ViewEventIntentResult;", "viewEventLauncher", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "Companion", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalendarModule extends Module {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = CalendarModule.class.getSimpleName();
    private AppContextActivityResultLauncher<CreatedEventOptions, CreateEventIntentResult> createEventLauncher;
    private final CoroutineScope moduleCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
    private final SimpleDateFormat sdf;
    private AppContextActivityResultLauncher<ViewedEventOptions, ViewEventIntentResult> viewEventLauncher;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lexpo/modules/calendar/CalendarModule$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$expo_calendar_release", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG$expo_calendar_release() {
            return CalendarModule.TAG;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: expo.modules.calendar.CalendarModule$launchAsyncWithModuleScope$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.calendar.CalendarModule$launchAsyncWithModuleScope$1", f = "CalendarModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ wn0.a<h0> $block;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wn0.a<h0> aVar, Promise promise, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = aVar;
            this.$promise = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$block, this.$promise, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                this.$block.invoke();
            } catch (ModuleDestroyedException unused) {
                this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled", null);
            }
            return h0.f84049a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            try {
                this.$block.invoke();
            } catch (ModuleDestroyedException unused) {
                this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled", null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.calendar.CalendarModule$saveEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class C46221 extends p013kotlin.jvm.internal.p implements l<String, Integer> {
        public static final C46221 INSTANCE = new C46221();

        C46221() {
            super(1, JsValuesMappersKt.class, "availabilityConstantMatchingString", "availabilityConstantMatchingString(Ljava/lang/String;)I", 1);
        }

        @Override // wn0.l
        public final Integer invoke(String p11) {
            s.k(p11, "p0");
            return Integer.valueOf(JsValuesMappersKt.availabilityConstantMatchingString(p11));
        }
    }

    /* JADX INFO: renamed from: expo.modules.calendar.CalendarModule$saveEvent$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends p013kotlin.jvm.internal.p implements l<String, Integer> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1, JsValuesMappersKt.class, "accessConstantMatchingString", "accessConstantMatchingString(Ljava/lang/String;)I", 1);
        }

        @Override // wn0.l
        public final Integer invoke(String p11) {
            s.k(p11, "p0");
            return Integer.valueOf(JsValuesMappersKt.accessConstantMatchingString(p11));
        }
    }

    public CalendarModule() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        this.sdf = simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPermissions(Promise promise) {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null && permissions.hasGrantedPermissions("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR")) {
            return true;
        }
        promise.reject("E_MISSING_PERMISSIONS", "CALENDAR permission is required to do this operation.", null);
        return false;
    }

    private final void createRemindersForEvent(int eventID, List<?> reminders) {
        int iReminderConstantMatchingString;
        int size = reminders.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = reminders.get(i11);
            s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map = (Map) obj;
            Object obj2 = map.get("relativeOffset");
            if (obj2 instanceof Number) {
                int i12 = -((Number) obj2).intValue();
                ContentValues contentValues = new ContentValues();
                if (map.containsKey("method")) {
                    Object obj3 = map.get("method");
                    iReminderConstantMatchingString = JsValuesMappersKt.reminderConstantMatchingString(obj3 instanceof String ? (String) obj3 : null);
                } else {
                    iReminderConstantMatchingString = 0;
                }
                contentValues.put("event_id", Integer.valueOf(eventID));
                contentValues.put("minutes", Integer.valueOf(i12));
                contentValues.put("method", Integer.valueOf(iReminderConstantMatchingString));
                getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deleteAttendee(String attendeeID) {
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Attendees.CONTENT_URI, Integer.parseInt(attendeeID));
        s.j(uriWithAppendedId, "withAppendedId(...)");
        return getContentResolver().delete(uriWithAppendedId, null, null) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deleteCalendar(String calendarId) {
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, Integer.parseInt(calendarId));
        s.j(uriWithAppendedId, "withAppendedId(...)");
        return getContentResolver().delete(uriWithAppendedId, null, null) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bundle> findAttendeesByEventId(String eventID) {
        Cursor cursorQuery = CalendarContract.Attendees.query(getContentResolver(), Long.parseLong(eventID), ConstantsKt.getFindAttendeesByEventIdQueryParameters());
        try {
            List<Bundle> listSerializeAttendees = serializeAttendees(cursorQuery);
            sn0.b.a(cursorQuery, null);
            return listSerializeAttendees;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final Bundle findCalendarById(String calendarID) {
        Bundle bundleSerializeEventCalendar;
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, Integer.parseInt(calendarID));
        s.j(uriWithAppendedId, "withAppendedId(...)");
        Cursor cursorQuery = getContentResolver().query(uriWithAppendedId, ConstantsKt.getFindCalendarByIdQueryFields(), null, null, null);
        if (cursorQuery == null) {
            throw new IllegalArgumentException("Cursor shouldn't be null");
        }
        try {
            if (cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                bundleSerializeEventCalendar = serializeEventCalendar(cursorQuery);
            } else {
                bundleSerializeEventCalendar = null;
            }
            sn0.b.a(cursorQuery, null);
            return bundleSerializeEventCalendar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bundle> findCalendars() {
        Cursor cursorQuery = getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, ConstantsKt.getFindCalendarsQueryParameters(), null, null, null);
        if (cursorQuery == null) {
            throw new IllegalArgumentException("Cursor shouldn't be null");
        }
        try {
            List<Bundle> listSerializeEventCalendars = serializeEventCalendars(cursorQuery);
            sn0.b.a(cursorQuery, null);
            return listSerializeEventCalendars;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle findEventById(String eventID) {
        Bundle bundleSerializeEvent;
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Integer.parseInt(eventID));
        s.j(uriWithAppendedId, "withAppendedId(...)");
        Cursor cursorQuery = getContentResolver().query(uriWithAppendedId, ConstantsKt.getFindEventByIdQueryParameters(), "((deleted != 1))", null, null);
        if (cursorQuery == null) {
            throw new IllegalArgumentException("Cursor shouldn't be null");
        }
        try {
            if (cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                bundleSerializeEvent = serializeEvent(cursorQuery);
            } else {
                bundleSerializeEvent = null;
            }
            sn0.b.a(cursorQuery, null);
            return bundleSerializeEvent;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bundle> findEvents(Object startDate, Object endDate, List<String> calendars) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        try {
            s.h(calendar);
            setDateInCalendar(calendar, startDate);
            s.h(calendar2);
            setDateInCalendar(calendar2, endDate);
        } catch (ParseException e11) {
            Log.e(TAG, "error parsing", e11);
        } catch (Exception e12) {
            Log.e(TAG, "misc error parsing", e12);
        }
        Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        ContentUris.appendId(builderBuildUpon, calendar.getTimeInMillis());
        ContentUris.appendId(builderBuildUpon, calendar2.getTimeInMillis());
        Uri uriBuild = builderBuildUpon.build();
        String str = "((begin >= " + calendar.getTimeInMillis() + ") AND (end <= " + calendar2.getTimeInMillis() + ") AND (visible = 1) ";
        List<String> list = calendars;
        if (!list.isEmpty()) {
            int size = list.size();
            String str2 = "AND (";
            for (int i11 = 0; i11 < size; i11++) {
                str2 = str2 + "calendar_id = '" + ((Object) calendars.get(i11)) + "'";
                if (i11 != calendars.size() - 1) {
                    str2 = str2 + " OR ";
                }
            }
            str = str + (str2 + ")");
        }
        Cursor cursorQuery = getContentResolver().query(uriBuild, ConstantsKt.getFindEventsQueryParameters(), str + ")", null, "begin ASC");
        if (cursorQuery == null) {
            throw new IllegalArgumentException("Cursor shouldn't be null");
        }
        try {
            List<Bundle> listSerializeEvents = serializeEvents(cursorQuery);
            sn0.b.a(cursorQuery, null);
            return listSerializeEvents;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final ContentResolver getContentResolver() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext.getContentResolver();
        }
        throw new Exceptions.ReactContextLost();
    }

    private final void launchAsyncWithModuleScope(Promise promise, wn0.a<h0> block) {
        BuildersKt__Builders_commonKt.launch$default(this.moduleCoroutineScope, null, null, new AnonymousClass1(block, promise, null), 3, null);
    }

    private final int optIntFromCursor(Cursor cursor, String columnName) {
        int columnIndex = cursor.getColumnIndex(columnName);
        if (columnIndex == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    private final String optStringFromCursor(Cursor cursor, String columnName) {
        int columnIndex = cursor.getColumnIndex(columnName);
        if (columnIndex == -1) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeEvent(ReadableArguments details) throws ParseException {
        String string = details.getString("id");
        s.j(string, "getString(...)");
        int i11 = Integer.parseInt(string);
        if (!details.containsKey("instanceStartDate")) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, i11);
            s.j(uriWithAppendedId, "withAppendedId(...)");
            return getContentResolver().delete(uriWithAppendedId, null, null) > 0;
        }
        ContentValues contentValues = new ContentValues();
        Calendar calendar = Calendar.getInstance();
        Object obj = details.get("instanceStartDate");
        try {
            if (obj instanceof String) {
                Date date = this.sdf.parse((String) obj);
                if (date != null) {
                    calendar.setTime(date);
                    contentValues.put("originalInstanceTime", Long.valueOf(calendar.getTimeInMillis()));
                } else {
                    Log.e(TAG, "Parsed date is null");
                }
            } else if (obj instanceof Number) {
                contentValues.put("originalInstanceTime", Long.valueOf(((Number) obj).longValue()));
            }
            contentValues.put("eventStatus", (Integer) 2);
            Uri uriWithAppendedId2 = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_EXCEPTION_URI, i11);
            s.j(uriWithAppendedId2, "withAppendedId(...)");
            getContentResolver().insert(uriWithAppendedId2, contentValues);
            return true;
        } catch (ParseException e11) {
            Log.e(TAG, AnalyticsAttribute.Error, e11);
            throw e11;
        }
    }

    private final void removeRemindersForEvent(int eventID) {
        Cursor cursorQuery = CalendarContract.Reminders.query(getContentResolver(), eventID, new String[]{Columns.ID});
        while (cursorQuery.moveToNext()) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Reminders.CONTENT_URI, cursorQuery.getLong(0));
            s.j(uriWithAppendedId, "withAppendedId(...)");
            getContentResolver().delete(uriWithAppendedId, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int saveAttendeeForEvent(ReadableArguments details, String eventID) throws Exception {
        boolean zContainsKey = details.containsKey("id");
        boolean z11 = !zContainsKey;
        AttendeeBuilder attendeeBuilderPutString = new AttendeeBuilder(details).putString("name", "attendeeName").putString(Scopes.EMAIL, "attendeeEmail", z11).putString("role", "attendeeRelationship", Boolean.valueOf(z11), CalendarModule$saveAttendeeForEvent$attendeeBuilder$1.INSTANCE).putString("type", "attendeeType", Boolean.valueOf(z11), CalendarModule$saveAttendeeForEvent$attendeeBuilder$2.INSTANCE).putString(PermissionsResponse.STATUS_KEY, "attendeeStatus", Boolean.valueOf(z11), CalendarModule$saveAttendeeForEvent$attendeeBuilder$3.INSTANCE);
        if (!zContainsKey) {
            attendeeBuilderPutString.put("event_id", eventID != null ? Integer.valueOf(Integer.parseInt(eventID)) : null);
            Uri uriInsert = getContentResolver().insert(CalendarContract.Attendees.CONTENT_URI, attendeeBuilderPutString.getAttendeeValues());
            s.h(uriInsert);
            String lastPathSegment = uriInsert.getLastPathSegment();
            s.h(lastPathSegment);
            return Integer.parseInt(lastPathSegment);
        }
        String string = details.getString("id");
        s.j(string, "getString(...)");
        int i11 = Integer.parseInt(string);
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Attendees.CONTENT_URI, i11);
        s.j(uriWithAppendedId, "withAppendedId(...)");
        getContentResolver().update(uriWithAppendedId, attendeeBuilderPutString.getAttendeeValues(), null, null);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int saveCalendar(ReadableArguments details) throws Exception {
        CalendarEventBuilder calendarEventBuilder = new CalendarEventBuilder(details);
        calendarEventBuilder.putEventString("name", "name").putEventString("calendar_displayName", "title").putEventBoolean("visible", "isVisible").putEventBoolean("sync_events", "isSynced");
        if (details.containsKey("id")) {
            String string = details.getString("id");
            s.j(string, "getString(...)");
            int i11 = Integer.parseInt(string);
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, i11);
            s.j(uriWithAppendedId, "withAppendedId(...)");
            getContentResolver().update(uriWithAppendedId, calendarEventBuilder.getEventValues(), null, null);
            return i11;
        }
        calendarEventBuilder.checkIfContainsRequiredKeys("name", "title", "source", "color", "accessLevel", "ownerAccount");
        ReadableArguments arguments = details.getArguments("source");
        if (!arguments.containsKey("name")) {
            throw new Exception("new calendars require a `source` object with a `name`");
        }
        boolean z11 = arguments.containsKey("isLocalAccount") ? arguments.getBoolean("isLocalAccount") : false;
        if (!arguments.containsKey("type") && !z11) {
            throw new Exception("new calendars require a `source` object with a `type`, or `isLocalAccount`: true");
        }
        String string2 = arguments.getString("name");
        s.j(string2, "getString(...)");
        CalendarEventBuilder calendarEventBuilderPut = calendarEventBuilder.put("account_name", string2);
        String string3 = z11 ? "LOCAL" : arguments.getString("type");
        s.h(string3);
        CalendarEventBuilder calendarEventBuilderPut2 = calendarEventBuilderPut.put("account_type", string3).put("calendar_color", details.getInt("color"));
        String string4 = details.getString("accessLevel");
        s.j(string4, "getString(...)");
        CalendarEventBuilder calendarEventBuilderPut3 = calendarEventBuilderPut2.put("calendar_access_level", JsValuesMappersKt.calAccessConstantMatchingString(string4));
        String string5 = details.getString("ownerAccount");
        s.j(string5, "getString(...)");
        calendarEventBuilderPut3.put("ownerAccount", string5).putEventTimeZone("calendar_timezone", "timeZone").putEventDetailsList("allowedReminders", "allowedReminders", new l() { // from class: expo.modules.calendar.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(CalendarModule.saveCalendar$lambda$47(obj));
            }
        }).putEventDetailsList("allowedAvailability", "allowedAvailabilities", new l() { // from class: expo.modules.calendar.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(CalendarModule.saveCalendar$lambda$48(obj));
            }
        }).putEventDetailsList("allowedAttendeeTypes", "allowedAttendeeTypes", new l() { // from class: expo.modules.calendar.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(CalendarModule.saveCalendar$lambda$49(obj));
            }
        });
        Uri uriInsert = getContentResolver().insert(CalendarContract.Calendars.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", arguments.getString("name")).appendQueryParameter("account_type", z11 ? "LOCAL" : arguments.getString("type")).build(), calendarEventBuilder.getEventValues());
        s.h(uriInsert);
        String lastPathSegment = uriInsert.getLastPathSegment();
        s.h(lastPathSegment);
        return Integer.parseInt(lastPathSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int saveCalendar$lambda$47(Object obj) {
        return JsValuesMappersKt.reminderConstantMatchingString((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int saveCalendar$lambda$48(Object obj) {
        s.i(obj, "null cannot be cast to non-null type kotlin.String");
        return JsValuesMappersKt.availabilityConstantMatchingString((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int saveCalendar$lambda$49(Object obj) {
        s.i(obj, "null cannot be cast to non-null type kotlin.String");
        return JsValuesMappersKt.attendeeTypeConstantMatchingString((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int saveEvent(ReadableArguments details) throws EventNotSavedException, ParseException {
        CalendarEventBuilder calendarEventBuilder = new CalendarEventBuilder(details);
        if (details.containsKey("startDate")) {
            Calendar calendar = Calendar.getInstance();
            Object obj = details.get("startDate");
            try {
                if (obj instanceof String) {
                    Date date = this.sdf.parse((String) obj);
                    if (date != null) {
                        calendar.setTime(date);
                        calendarEventBuilder.put("dtstart", calendar.getTimeInMillis());
                    } else {
                        Log.e(TAG, "Parsed date is null");
                    }
                } else if (obj instanceof Number) {
                    calendarEventBuilder.put("dtstart", ((Number) obj).longValue());
                } else {
                    Log.e(TAG, "startDate has unsupported type");
                }
            } catch (ParseException e11) {
                Log.e(TAG, AnalyticsAttribute.Error, e11);
                throw e11;
            }
        }
        if (details.containsKey("endDate")) {
            Calendar calendar2 = Calendar.getInstance();
            Object obj2 = details.get("endDate");
            try {
                if (obj2 instanceof String) {
                    Date date2 = this.sdf.parse((String) obj2);
                    if (date2 != null) {
                        calendar2.setTime(date2);
                        calendarEventBuilder.put("dtend", calendar2.getTimeInMillis());
                    } else {
                        Log.e(TAG, "Parsed date is null");
                    }
                } else if (obj2 instanceof Number) {
                    calendarEventBuilder.put("dtend", ((Number) obj2).longValue());
                }
                h0 h0Var = h0.f84049a;
            } catch (ParseException e12) {
                Log.e(TAG, AnalyticsAttribute.Error, e12);
                throw e12;
            }
        }
        if (details.containsKey("recurrenceRule")) {
            ReadableArguments arguments = details.getArguments("recurrenceRule");
            if (arguments.containsKey("frequency")) {
                EventRecurrenceUtils eventRecurrenceUtils = EventRecurrenceUtils.INSTANCE;
                s.h(arguments);
                Recurrence recurrenceExtractRecurrence = eventRecurrenceUtils.extractRecurrence(arguments);
                if (recurrenceExtractRecurrence.getEndDate() == null && recurrenceExtractRecurrence.getOccurrence() == null) {
                    long asLong = (calendarEventBuilder.getAsLong("dtend") - calendarEventBuilder.getAsLong("dtstart")) / ((long) 1000);
                    calendarEventBuilder.putNull("lastDate").putNull("dtend").put("duration", "PT" + asLong + "S");
                }
                calendarEventBuilder.put("rrule", eventRecurrenceUtils.createRecurrenceRule(recurrenceExtractRecurrence));
            }
        }
        calendarEventBuilder.putEventBoolean("hasAlarm", "alarms", true).putEventString("availability", "availability", C46221.INSTANCE).putEventString("title", "title").putEventString("description", "notes").putEventString("eventLocation", "location").putEventString("organizer", "organizerEmail").putEventBoolean("allDay", "allDay").putEventBoolean("guestsCanModify", "guestsCanModify").putEventBoolean("guestsCanInviteOthers", "guestsCanInviteOthers").putEventBoolean("guestsCanSeeGuests", "guestsCanSeeGuests").putEventTimeZone("eventTimezone", "timeZone").putEventTimeZone("eventEndTimezone", "endTimeZone").putEventString("accessLevel", "accessLevel", AnonymousClass2.INSTANCE);
        if (details.containsKey("id")) {
            String string = details.getString("id");
            s.j(string, "getString(...)");
            int i11 = Integer.parseInt(string);
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, i11);
            s.j(uriWithAppendedId, "withAppendedId(...)");
            getContentResolver().update(uriWithAppendedId, calendarEventBuilder.getEventValues(), null, null);
            removeRemindersForEvent(i11);
            if (details.containsKey("alarms")) {
                List list = details.getList("alarms");
                s.j(list, "getList(...)");
                createRemindersForEvent(i11, list);
            }
            return i11;
        }
        if (!details.containsKey("calendarId")) {
            throw new InvalidArgumentException("CalendarId is required.");
        }
        String string2 = details.getString("calendarId");
        s.j(string2, "getString(...)");
        Bundle bundleFindCalendarById = findCalendarById(string2);
        if (bundleFindCalendarById == null) {
            throw new InvalidArgumentException("Couldn't find calendar with given id: " + details.getString("calendarId"));
        }
        String string3 = bundleFindCalendarById.getString("id");
        s.h(string3);
        calendarEventBuilder.put("calendar_id", Integer.parseInt(string3));
        Uri uriInsert = getContentResolver().insert(CalendarContract.Events.CONTENT_URI, calendarEventBuilder.getEventValues());
        if (uriInsert == null) {
            throw new EventNotSavedException();
        }
        String lastPathSegment = uriInsert.getLastPathSegment();
        s.h(lastPathSegment);
        int i12 = Integer.parseInt(lastPathSegment);
        if (details.containsKey("alarms")) {
            List list2 = details.getList("alarms");
            s.j(list2, "getList(...)");
            createRemindersForEvent(i12, list2);
        }
        return i12;
    }

    private final ArrayList<Bundle> serializeAlarms(long eventID) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Cursor cursorQuery = CalendarContract.Reminders.query(getContentResolver(), eventID, new String[]{"minutes", "method"});
        while (cursorQuery.moveToNext()) {
            Bundle bundle = new Bundle();
            bundle.putInt("relativeOffset", -cursorQuery.getInt(0));
            bundle.putString("method", JsValuesMappersKt.reminderStringMatchingConstant(cursorQuery.getInt(1)));
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final Bundle serializeAttendee(Cursor cursor) {
        Bundle bundle = new Bundle();
        bundle.putString("id", optStringFromCursor(cursor, Columns.ID));
        bundle.putString("name", optStringFromCursor(cursor, "attendeeName"));
        bundle.putString(Scopes.EMAIL, optStringFromCursor(cursor, "attendeeEmail"));
        bundle.putString("role", JsValuesMappersKt.attendeeRelationshipStringMatchingConstant(optIntFromCursor(cursor, "attendeeRelationship")));
        bundle.putString("type", JsValuesMappersKt.attendeeTypeStringMatchingConstant(optIntFromCursor(cursor, "attendeeType")));
        bundle.putString(PermissionsResponse.STATUS_KEY, JsValuesMappersKt.attendeeStatusStringMatchingConstant(optIntFromCursor(cursor, "attendeeStatus")));
        return bundle;
    }

    private final List<Bundle> serializeAttendees(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(serializeAttendee(cursor));
        }
        return arrayList;
    }

    private final Bundle serializeEvent(Cursor cursor) {
        String str;
        boolean z11;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String string = cursor.getString(3);
        String str2 = "";
        if (string != null) {
            calendar.setTimeInMillis(Long.parseLong(string));
            str = this.sdf.format(calendar.getTime());
        } else {
            str = "";
        }
        String string2 = cursor.getString(4);
        if (string2 != null) {
            calendar2.setTimeInMillis(Long.parseLong(string2));
            str2 = this.sdf.format(calendar2.getTime());
        }
        String strOptStringFromCursor = optStringFromCursor(cursor, "rrule");
        Bundle bundle = null;
        if (strOptStringFromCursor != null) {
            Bundle bundle2 = new Bundle();
            z11 = true;
            String[] strArr = (String[]) p013kotlin.text.t.f1(strOptStringFromCursor, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
            String str3 = ((String[]) p013kotlin.text.t.f1(strArr[0], new String[]{"="}, false, 0, 6, null).toArray(new String[0]))[1];
            Locale locale = Locale.getDefault();
            s.j(locale, "getDefault(...)");
            String lowerCase = str3.toLowerCase(locale);
            s.j(lowerCase, "toLowerCase(...)");
            bundle2.putString("frequency", lowerCase);
            if (strArr.length >= 2 && s.f(((String[]) p013kotlin.text.t.f1(strArr[1], new String[]{"="}, false, 0, 6, null).toArray(new String[0]))[0], "INTERVAL")) {
                bundle2.putInt("interval", Integer.parseInt(((String[]) p013kotlin.text.t.f1(strArr[1], new String[]{"="}, false, 0, 6, null).toArray(new String[0]))[1]));
            }
            if (strArr.length >= 3) {
                String[] strArr2 = (String[]) p013kotlin.text.t.f1(strArr[2], new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (strArr2.length >= 2) {
                    if (s.f(strArr2[0], "UNTIL")) {
                        try {
                            Date date = this.sdf.parse(strArr2[1]);
                            bundle2.putString("endDate", date != null ? date.toString() : null);
                        } catch (NullPointerException e11) {
                            Log.e(TAG, "endDate is null", e11);
                        } catch (ParseException e12) {
                            Log.e(TAG, "Couldn't parse the `endDate` property.", e12);
                        }
                    } else if (s.f(strArr2[0], "COUNT")) {
                        bundle2.putInt("occurrence", Integer.parseInt(((String[]) p013kotlin.text.t.f1(strArr[2], new String[]{"="}, false, 0, 6, null).toArray(new String[0]))[1]));
                    }
                }
                Log.e(TAG, "Couldn't parse termination rules: '" + strArr[2] + "'.", null);
            }
            bundle = bundle2;
        } else {
            z11 = true;
        }
        Bundle bundle3 = new Bundle();
        if (bundle != null) {
            bundle3.putBundle("recurrenceRule", bundle);
        }
        bundle3.putString("id", cursor.getString(0));
        bundle3.putString("calendarId", optStringFromCursor(cursor, "calendar_id"));
        bundle3.putString("title", optStringFromCursor(cursor, "title"));
        bundle3.putString("notes", optStringFromCursor(cursor, "description"));
        bundle3.putString("startDate", str);
        bundle3.putString("endDate", str2);
        bundle3.putBoolean("allDay", optIntFromCursor(cursor, "allDay") != 0 ? z11 : false);
        bundle3.putString("location", optStringFromCursor(cursor, "eventLocation"));
        bundle3.putString("availability", JsValuesMappersKt.availabilityStringMatchingConstant(optIntFromCursor(cursor, "availability")));
        bundle3.putParcelableArrayList("alarms", serializeAlarms(cursor.getLong(0)));
        bundle3.putString("organizerEmail", optStringFromCursor(cursor, "organizer"));
        bundle3.putString("timeZone", optStringFromCursor(cursor, "eventTimezone"));
        bundle3.putString("endTimeZone", optStringFromCursor(cursor, "eventEndTimezone"));
        bundle3.putString("accessLevel", JsValuesMappersKt.accessStringMatchingConstant(optIntFromCursor(cursor, "accessLevel")));
        bundle3.putBoolean("guestsCanModify", optIntFromCursor(cursor, "guestsCanModify") != 0 ? z11 : false);
        bundle3.putBoolean("guestsCanInviteOthers", optIntFromCursor(cursor, "guestsCanInviteOthers") != 0 ? z11 : false);
        bundle3.putBoolean("guestsCanSeeGuests", optIntFromCursor(cursor, "guestsCanSeeGuests") != 0 ? z11 : false);
        bundle3.putString("originalId", optStringFromCursor(cursor, "original_id"));
        if (cursor.getColumnCount() > 18) {
            bundle3.putString("instanceId", cursor.getString(18));
        }
        return bundle3;
    }

    private final Bundle serializeEventCalendar(Cursor cursor) {
        Bundle bundle = new Bundle();
        bundle.putString("id", optStringFromCursor(cursor, Columns.ID));
        bundle.putString("title", optStringFromCursor(cursor, "calendar_displayName"));
        bundle.putBoolean("isPrimary", optIntFromCursor(cursor, "isPrimary") == 1);
        bundle.putStringArrayList("allowedAvailabilities", JsValuesMappersKt.calendarAllowedAvailabilitiesFromDBString(stringFromCursor(cursor, "allowedAvailability")));
        bundle.putString("name", optStringFromCursor(cursor, "name"));
        t0 t0Var = t0.f86535a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(optIntFromCursor(cursor, "calendar_color") & 16777215)}, 1));
        s.j(str, "format(...)");
        bundle.putString("color", str);
        bundle.putString("ownerAccount", optStringFromCursor(cursor, "ownerAccount"));
        bundle.putString("timeZone", optStringFromCursor(cursor, "calendar_timezone"));
        bundle.putStringArrayList("allowedReminders", JsValuesMappersKt.calendarAllowedRemindersFromDBString(stringFromCursor(cursor, "allowedReminders")));
        bundle.putStringArrayList("allowedAttendeeTypes", JsValuesMappersKt.calendarAllowedAttendeeTypesFromDBString(stringFromCursor(cursor, "allowedAttendeeTypes")));
        bundle.putBoolean("isVisible", optIntFromCursor(cursor, "visible") != 0);
        bundle.putBoolean("isSynced", optIntFromCursor(cursor, "sync_events") != 0);
        int iOptIntFromCursor = optIntFromCursor(cursor, "calendar_access_level");
        bundle.putString("accessLevel", JsValuesMappersKt.calAccessStringMatchingConstant(iOptIntFromCursor));
        bundle.putBoolean("allowsModifications", iOptIntFromCursor == 800 || iOptIntFromCursor == 700 || iOptIntFromCursor == 600 || iOptIntFromCursor == 500);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", optStringFromCursor(cursor, "account_name"));
        String strOptStringFromCursor = optStringFromCursor(cursor, "account_type");
        bundle2.putString("type", strOptStringFromCursor);
        bundle2.putBoolean("isLocalAccount", s.f(strOptStringFromCursor, "LOCAL"));
        bundle.putBundle("source", bundle2);
        return bundle;
    }

    private final List<Bundle> serializeEventCalendars(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(serializeEventCalendar(cursor));
        }
        return arrayList;
    }

    private final List<Bundle> serializeEvents(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(serializeEvent(cursor));
        }
        return arrayList;
    }

    private final void setDateInCalendar(Calendar calendar, Object date) throws ParseException {
        if (!(date instanceof String)) {
            if (date instanceof Number) {
                calendar.setTimeInMillis(((Number) date).longValue());
                return;
            } else {
                Log.e(TAG, "date has unsupported type");
                return;
            }
        }
        Date date2 = this.sdf.parse((String) date);
        if (date2 != null) {
            calendar.setTime(date2);
        } else {
            Log.e(TAG, "Parsed date is null");
        }
    }

    private final String stringFromCursor(Cursor cursor, String columnName) throws Exception {
        int columnIndex = cursor.getColumnIndex(columnName);
        if (columnIndex == -1) {
            throw new Exception("String not found");
        }
        String string = cursor.getString(columnIndex);
        s.j(string, "getString(...)");
        return string;
    }

    private final void withPermissions(Promise promise, wn0.a<h0> block) {
        if (checkPermissions(promise)) {
            block.invoke();
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent3;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoCalendar");
            moduleDefinitionBuilder.RegisterActivityContracts(new CalendarModule$definition$1$1(this, null));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_DESTROY;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    try {
                        CoroutineScopeKt.cancel(this.this$0.moduleCoroutineScope, new ModuleDestroyedException());
                    } catch (IllegalStateException unused) {
                        Log.e(CalendarModule.TAG, "The scope does not have a job in it");
                    }
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(String.class);
            Boolean bool = Boolean.TRUE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getCalendarsAsync", new AsyncFunctionWithPromiseComponent("getCalendarsAsync", new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.checkPermissions(promise)) {
                        if (str == null || !s.f(str, "reminder")) {
                            BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$4$lambda$3$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, promise), 3, null);
                        } else {
                            promise.reject("E_CALENDARS_NOT_FOUND", "Calendars of type `reminder` are not supported on Android", null);
                        }
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            d dVarB2 = o0.b(ReadableArguments.class);
            Boolean bool2 = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool2));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(ReadableArguments.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ReadableArguments.class);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("saveCalendarAsync", new AsyncFunctionWithPromiseComponent("saveCalendarAsync", new AnyType[]{anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    ReadableArguments readableArguments = (ReadableArguments) objArr[0];
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$7$lambda$6$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, readableArguments, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteCalendarAsync", new AsyncFunctionWithPromiseComponent("deleteCalendarAsync", new AnyType[]{anyType3}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$6
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$10$lambda$9$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r4), bool2));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(Object.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Object.class);
                    }
                }), converters4);
            }
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r4), bool2));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(r4), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Object.class);
                    }
                }), converters4);
            }
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r2), bool2));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(o0.b(List.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.p(List.class, co0.s.INSTANCE.d(o0.o(String.class)));
                    }
                }), converters4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getEventsAsync", new AsyncFunctionWithPromiseComponent("getEventsAsync", new AnyType[]{anyType4, anyType5, anyType6}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$10
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    List list = (List) objArr[2];
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$13$lambda$12$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, obj, obj2, list, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters5);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getEventByIdAsync", new AsyncFunctionWithPromiseComponent("getEventByIdAsync", new AnyType[]{anyType7}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$12
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$16$lambda$15$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters6 = moduleDefinitionBuilder.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool2));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(o0.b(ReadableArguments.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ReadableArguments.class);
                    }
                }), converters6);
            }
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(o0.b(r6), true, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$14
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(ReadableArguments.class);
                    }
                }), converters6);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("saveEventAsync", new AsyncFunctionWithPromiseComponent("saveEventAsync", new AnyType[]{anyType8, anyType9}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$15
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    ReadableArguments readableArguments = (ReadableArguments) obj;
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$19$lambda$18$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, readableArguments, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters7 = moduleDefinitionBuilder.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool2));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(o0.b(r6), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$16
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ReadableArguments.class);
                    }
                }), converters7);
            }
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(o0.b(r6), true, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$17
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(ReadableArguments.class);
                    }
                }), converters7);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteEventAsync", new AsyncFunctionWithPromiseComponent("deleteEventAsync", new AnyType[]{anyType10, anyType11}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$18
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    ReadableArguments readableArguments = (ReadableArguments) obj;
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$22$lambda$21$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, readableArguments, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters8 = moduleDefinitionBuilder.getConverters();
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$19
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters8);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getAttendeesForEventAsync", new AsyncFunctionWithPromiseComponent("getAttendeesForEventAsync", new AnyType[]{anyType12}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$20
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$25$lambda$24$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters9 = moduleDefinitionBuilder.getConverters();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool2));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(o0.b(r6), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$21
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ReadableArguments.class);
                    }
                }), converters9);
            }
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$22
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters9);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("saveAttendeeForEventAsync", new AsyncFunctionWithPromiseComponent("saveAttendeeForEventAsync", new AnyType[]{anyType13, anyType14}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$23
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    ReadableArguments readableArguments = (ReadableArguments) obj;
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$28$lambda$27$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, readableArguments, str, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters10 = moduleDefinitionBuilder.getConverters();
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$24
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters10);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteAttendeeAsync", new AsyncFunctionWithPromiseComponent("deleteAttendeeAsync", new AnyType[]{anyType15}, new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunctionWithPromise$25
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.checkPermissions(promise)) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new CalendarModule$definition$lambda$38$lambda$31$lambda$30$$inlined$launchAsyncWithModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder.AsyncFunction("createEventInCalendarAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters11 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r0), bool2));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(o0.b(CreatedEventOptions.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$Coroutine$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(CreatedEventOptions.class);
                    }
                }), converters11);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType16}, new CalendarModule$definition$lambda$38$$inlined$Coroutine$2(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("openEventInCalendarAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters12 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r3), bool2));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(o0.b(ViewedEventOptions.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$Coroutine$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ViewedEventOptions.class);
                    }
                }), converters12);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType17}, new CalendarModule$definition$lambda$38$$inlined$Coroutine$4(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = moduleDefinitionBuilder.AsyncFunction("editEventInCalendarAsync");
            String name3 = asyncFunctionBuilderAsyncFunction3.getName();
            TypeConverterProvider converters13 = asyncFunctionBuilderAsyncFunction3.getConverters();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r3), bool2));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(o0.b(r3), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$Coroutine$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ViewedEventOptions.class);
                    }
                }), converters13);
            }
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, new AnyType[]{anyType18}, new CalendarModule$definition$lambda$38$$inlined$Coroutine$6(null, this)));
            boolean zF = s.f(String.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("openEventInCalendar", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.ReactContextLost {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        String str = (String) promise;
                        Context reactContext = this.this$0.getAppContext().getReactContext();
                        if (reactContext == null) {
                            throw new Exceptions.ReactContextLost();
                        }
                        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(str));
                        s.j(uriWithAppendedId, "withAppendedId(...)");
                        Intent data = new Intent("android.intent.action.VIEW").addFlags(268435456).setData(uriWithAppendedId);
                        s.j(data, "setData(...)");
                        if (data.resolveActivity(reactContext.getPackageManager()) != null) {
                            reactContext.startActivity(data);
                        }
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws Exceptions.ReactContextLost {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
                moduleDefinitionBuilder = moduleDefinitionBuilder;
            } else {
                TypeConverterProvider converters14 = moduleDefinitionBuilder.getConverters();
                AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
                if (anyType19 == null) {
                    anyType19 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(String.class);
                        }
                    }), converters14);
                }
                AnyType[] anyTypeArr = {anyType19};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) throws Exceptions.ReactContextLost {
                        s.k(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        Context reactContext = this.this$0.getAppContext().getReactContext();
                        if (reactContext == null) {
                            throw new Exceptions.ReactContextLost();
                        }
                        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(str));
                        s.j(uriWithAppendedId, "withAppendedId(...)");
                        Intent data = new Intent("android.intent.action.VIEW").addFlags(268435456).setData(uriWithAppendedId);
                        s.j(data, "setData(...)");
                        if (data.resolveActivity(reactContext.getPackageManager()) != null) {
                            reactContext.startActivity(data);
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("openEventInCalendar", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("openEventInCalendar", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("openEventInCalendar", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("openEventInCalendar", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("openEventInCalendar", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("openEventInCalendar", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("openEventInCalendar", asyncFunctionWithPromiseComponent);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("requestCalendarPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
                    }
                });
            } else {
                TypeConverterProvider converters15 = moduleDefinitionBuilder.getConverters();
                AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Promise.class), bool2));
                if (anyType20 == null) {
                    anyType20 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters15);
                }
                AnyType[] anyTypeArr2 = {anyType20};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("requestCalendarPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("requestCalendarPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("requestCalendarPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("requestCalendarPermissionsAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("requestCalendarPermissionsAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("requestCalendarPermissionsAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestCalendarPermissionsAsync", asyncFunctionWithPromiseComponent2);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("getCalendarPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$7
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
                    }
                });
            } else {
                TypeConverterProvider converters16 = moduleDefinitionBuilder.getConverters();
                AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Promise.class), bool2));
                if (anyType21 == null) {
                    anyType21 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$8
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters16);
                }
                AnyType[] anyTypeArr3 = {anyType21};
                l<Object[], h0> lVar3 = new l<Object[], h0>() { // from class: expo.modules.calendar.CalendarModule$definition$lambda$38$$inlined$AsyncFunction$9
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("getCalendarPermissionsAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("getCalendarPermissionsAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("getCalendarPermissionsAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("getCalendarPermissionsAsync", anyTypeArr3, lVar3);
                } else {
                    stringAsyncFunctionComponent3 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getCalendarPermissionsAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("getCalendarPermissionsAsync", anyTypeArr3, lVar3);
                }
                asyncFunctionWithPromiseComponent3 = stringAsyncFunctionComponent3;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getCalendarPermissionsAsync", asyncFunctionWithPromiseComponent3);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
