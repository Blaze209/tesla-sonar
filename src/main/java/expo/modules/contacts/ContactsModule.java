package expo.modules.contacts;

import android.app.Activity;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import co0.q;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.actions.SearchIntents;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.BirthdayModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002¢\u0006\u0004\b$\u0010%JS\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b,\u0010-JA\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b1\u00102J#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0003J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lexpo/modules/contacts/ContactsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/contacts/Contact;", "contact", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "presentForm", "(Lexpo/modules/contacts/Contact;Lexpo/modules/kotlin/Promise;)V", "presentEditForm", "initContact", "", "", "", "data", "mutateContact", "(Lexpo/modules/contacts/Contact;Ljava/util/Map;)Lexpo/modules/contacts/Contact;", "contactId", "getLookupKeyForContactId", "(Ljava/lang/String;)Ljava/lang/String;", "", "keysToFetch", "getContactById", "(Ljava/lang/String;Ljava/util/Set;)Lexpo/modules/contacts/Contact;", SearchIntents.EXTRA_QUERY, "sortOrder", "Lexpo/modules/contacts/ContactPage;", "getContactByName", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;", "Lexpo/modules/contacts/ContactQuery;", "options", "getAllContactsAsync", "(Lexpo/modules/contacts/ContactQuery;)Lexpo/modules/contacts/ContactPage;", "Lexpo/modules/contacts/QueryArguments;", "createProjectionForQuery", "(Ljava/util/Set;)Lexpo/modules/contacts/QueryArguments;", "", "pageOffset", "pageSize", "", "queryStrings", "initQueryField", "fetchContacts", "(II[Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "input", "sortContactsBy", "(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;", "Landroid/database/Cursor;", "cursor", "loadContactsFrom", "(Landroid/database/Cursor;)Ljava/util/Map;", "ensureReadPermission", "ensureWritePermission", "ensurePermissions", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "contactPickingPromise", "Lexpo/modules/kotlin/Promise;", "contactManipulationPromise", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissionsManager", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "resolver", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactsModule extends Module {
    private Promise contactManipulationPromise;
    private Promise contactPickingPromise;

    private final QueryArguments createProjectionForQuery(Set<String> keysToFetch) {
        ArrayList arrayList = new ArrayList(ContactsModuleKt.DEFAULT_PROJECTION);
        ArrayList arrayList2 = new ArrayList(v.p("vnd.android.cursor.item/name", "vnd.android.cursor.item/organization"));
        String str = "mimetype=? OR mimetype=?";
        if (keysToFetch.contains("phoneNumbers")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add(Columns.ID);
            str = "mimetype=? OR mimetype=? OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/phone_v2");
        }
        if (keysToFetch.contains("emails")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/email_v2");
        }
        if (keysToFetch.contains("addresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.DATA_4);
            arrayList.add(Columns.DATA_5);
            arrayList.add(Columns.DATA_6);
            arrayList.add(Columns.DATA_7);
            arrayList.add(Columns.DATA_8);
            arrayList.add(Columns.DATA_9);
            arrayList.add(Columns.DATA_10);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/postal-address_v2");
        }
        if (keysToFetch.contains("note")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/note");
        }
        if (keysToFetch.contains(DateModelKt.BIRTHDAY) || keysToFetch.contains("dates")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/contact_event");
        }
        if (keysToFetch.contains("instantMessageAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.DATA_5);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/im");
        }
        if (keysToFetch.contains("urlAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/website");
        }
        if (keysToFetch.contains("extraNames")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/nickname");
        }
        if (keysToFetch.contains("relationships")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/relation");
        }
        if (keysToFetch.contains("phoneticFirstName")) {
            arrayList.add(Columns.DATA_7);
        }
        if (keysToFetch.contains("phoneticLastName")) {
            arrayList.add(Columns.DATA_9);
        }
        if (keysToFetch.contains("phoneticMiddleName")) {
            arrayList.add(Columns.DATA_8);
        }
        if (keysToFetch.contains("namePrefix")) {
            arrayList.add(Columns.DATA_4);
        }
        if (keysToFetch.contains("nameSuffix")) {
            arrayList.add(Columns.DATA_6);
        }
        if (keysToFetch.contains("isFavorite")) {
            arrayList.add(Columns.STARRED);
        }
        return new QueryArguments((String[]) arrayList.toArray(new String[0]), str, (String[]) arrayList2.toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermissions() throws MissingPermissionException {
        ensureReadPermission();
        ensureWritePermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureReadPermission() throws MissingPermissionException {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.READ_CONTACTS")) {
            throw new MissingPermissionException("android.permission.READ_CONTACTS");
        }
    }

    private final void ensureWritePermission() throws MissingPermissionException {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.WRITE_CONTACTS")) {
            throw new MissingPermissionException("android.permission.WRITE_CONTACTS");
        }
    }

    private final ContactPage fetchContacts(int pageOffset, int pageSize, String[] queryStrings, String initQueryField, Set<String> keysToFetch, String sortOrder) throws Exceptions.ReactContextLost {
        if (initQueryField == null) {
            initQueryField = Columns.CONTACT_ID;
        }
        boolean z11 = pageSize == 0;
        QueryArguments queryArgumentsCreateProjectionForQuery = createProjectionForQuery(keysToFetch);
        ContentResolver resolver = getResolver();
        Cursor cursorQuery = (queryStrings == null || queryStrings.length == 0) ? resolver.query(ContactsContract.Data.CONTENT_URI, queryArgumentsCreateProjectionForQuery.getProjection(), queryArgumentsCreateProjectionForQuery.getSelection(), queryArgumentsCreateProjectionForQuery.getSelectionArgs(), null) : resolver.query(ContactsContract.Data.CONTENT_URI, queryArgumentsCreateProjectionForQuery.getProjection(), initQueryField + " LIKE ?", queryStrings, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            Map<String, Contact> mapLoadContactsFrom = loadContactsFrom(cursorQuery);
            ArrayList arrayList = new ArrayList();
            ArrayList<Contact> arrayListSortContactsBy = sortContactsBy(new ArrayList<>(mapLoadContactsFrom.values()), sortOrder);
            int size = arrayListSortContactsBy.size();
            for (int i11 = z11 ? 0 : pageOffset; i11 < size; i11++) {
                Contact contact = arrayListSortContactsBy.get(i11);
                s.j(contact, "get(...)");
                Contact contact2 = contact;
                if (!z11 && i11 - pageOffset >= pageSize) {
                    break;
                }
                arrayList.add(contact2);
            }
            ContactPage contactPage = new ContactPage(arrayList, pageOffset > 0, pageOffset + pageSize < size, size);
            sn0.b.a(cursorQuery, null);
            return contactPage;
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
    public final ContactPage getAllContactsAsync(ContactQuery options) {
        return fetchContacts(options.getPageOffset(), options.getPageSize(), null, null, options.getFields(), options.getSort());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact getContactById(String contactId, Set<String> keysToFetch) {
        Cursor cursorQuery = getResolver().query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery(keysToFetch).getProjection(), "contact_id = ?", new String[]{contactId}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            Contact contact = (Contact) v.p0(loadContactsFrom(cursorQuery).values());
            sn0.b.a(cursorQuery, null);
            return contact;
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
    public final ContactPage getContactByName(String query, Set<String> keysToFetch, String sortOrder) {
        return fetchContacts(0, 9999, new String[]{query}, Columns.DISPLAY_NAME, keysToFetch, sortOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getCurrentActivity() {
        return getAppContext().getThrowingActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLookupKeyForContactId(String contactId) throws Exceptions.ReactContextLost {
        Cursor cursorQuery = getResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{Columns.LOOKUP_KEY}, "_id = " + contactId, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            sn0.b.a(cursorQuery, null);
            return string;
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
    public final Permissions getPermissionsManager() throws Exceptions.PermissionsModuleNotFound {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new Exceptions.PermissionsModuleNotFound();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        ContentResolver contentResolver = reactContext.getContentResolver();
        s.j(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    private final Map<String, Contact> loadContactsFrom(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex(Columns.CONTACT_ID));
            Object contact = linkedHashMap.get(string);
            if (contact == null) {
                s.h(string);
                contact = new Contact(string, getAppContext());
                linkedHashMap.put(string, contact);
            }
            ((Contact) contact).fromCursor(cursor);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact mutateContact(Contact initContact, Map<String, ? extends Object> data) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (initContact == null) {
            String string = UUID.randomUUID().toString();
            s.j(string, "toString(...)");
            initContact = new Contact(string, getAppContext());
        }
        String str = (String) ContactsModuleKt.safeGet(data, EContextPaymentMethod.FIRST_NAME);
        if (str != null) {
            initContact.setFirstName(str);
        }
        String str2 = (String) ContactsModuleKt.safeGet(data, "middleName");
        if (str2 != null) {
            initContact.setMiddleName(str2);
        }
        String str3 = (String) ContactsModuleKt.safeGet(data, EContextPaymentMethod.LAST_NAME);
        if (str3 != null) {
            initContact.setLastName(str3);
        }
        String str4 = (String) ContactsModuleKt.safeGet(data, "namePrefix");
        if (str4 != null) {
            initContact.setPrefix(str4);
        }
        String str5 = (String) ContactsModuleKt.safeGet(data, "nameSuffix");
        if (str5 != null) {
            initContact.setSuffix(str5);
        }
        String str6 = (String) ContactsModuleKt.safeGet(data, "phoneticFirstName");
        if (str6 != null) {
            initContact.setPhoneticFirstName(str6);
        }
        String str7 = (String) ContactsModuleKt.safeGet(data, "phoneticMiddleName");
        if (str7 != null) {
            initContact.setPhoneticMiddleName(str7);
        }
        String str8 = (String) ContactsModuleKt.safeGet(data, "phoneticLastName");
        if (str8 != null) {
            initContact.setPhoneticLastName(str8);
        }
        String str9 = (String) ContactsModuleKt.safeGet(data, "company");
        if (str9 != null) {
            initContact.setCompany(str9);
        }
        String str10 = (String) ContactsModuleKt.safeGet(data, "jobTitle");
        if (str10 != null) {
            initContact.setJobTitle(str10);
        }
        String str11 = (String) ContactsModuleKt.safeGet(data, "department");
        if (str11 != null) {
            initContact.setDepartment(str11);
        }
        String str12 = (String) ContactsModuleKt.safeGet(data, "note");
        if (str12 != null) {
            initContact.setNote(str12);
        }
        if (data.containsKey("image")) {
            Object obj = data.get("image");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey("uri")) {
                    initContact.setPhotoUri((String) map.get("uri"));
                    initContact.setHasPhoto(true);
                }
            }
        }
        BaseModel.Companion companion = BaseModel.INSTANCE;
        List<PostalAddressModel> listDecodeList = companion.decodeList((List) ContactsModuleKt.safeGet(data, "addresses"), PostalAddressModel.class);
        if (listDecodeList != null) {
            initContact.setAddresses(listDecodeList);
        }
        List<PhoneNumberModel> listDecodeList2 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "phoneNumbers"), PhoneNumberModel.class);
        if (listDecodeList2 != null) {
            initContact.setPhones(listDecodeList2);
        }
        List<EmailModel> listDecodeList3 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "emails"), EmailModel.class);
        if (listDecodeList3 != null) {
            initContact.setEmails(listDecodeList3);
        }
        List<ImAddressModel> listDecodeList4 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "instantMessageAddresses"), ImAddressModel.class);
        if (listDecodeList4 != null) {
            initContact.setImAddresses(listDecodeList4);
        }
        List<UrlAddressModel> listDecodeList5 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "urlAddresses"), UrlAddressModel.class);
        if (listDecodeList5 != null) {
            initContact.setUrlAddresses(listDecodeList5);
        }
        List<ExtraNameModel> listDecodeList6 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "extraNames"), ExtraNameModel.class);
        if (listDecodeList6 != null) {
            initContact.setExtraNames(listDecodeList6);
        }
        List<DateModel> listDecodeList7 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "dates"), DateModel.class);
        if (listDecodeList7 != null) {
            initContact.setDates(listDecodeList7);
        }
        Object obj2 = data.get(DateModelKt.BIRTHDAY);
        if (obj2 != null) {
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            if (obj2 != null) {
                List<DateModel> dates = initContact.getDates();
                BirthdayModel birthdayModel = new BirthdayModel();
                birthdayModel.fromMap((Map) obj2);
                dates.add(birthdayModel);
            }
        }
        List<RelationshipModel> listDecodeList8 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "relationships"), RelationshipModel.class);
        if (listDecodeList8 != null) {
            initContact.setRelationships(listDecodeList8);
        }
        Boolean bool = (Boolean) ContactsModuleKt.safeGet(data, "isFavorite");
        if (bool != null) {
            initContact.setFavorite(bool.booleanValue());
        }
        return initContact;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentEditForm(Contact contact, Promise promise) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(Long.parseLong(contact.getContactId()), contact.getLookupKey());
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(lookupUri, "vnd.android.cursor.item/contact");
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_EDIT_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentForm(Contact contact, Promise promise) {
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", contact.getFinalDisplayName());
        intent.putParcelableArrayListExtra("data", contact.getContentValues());
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_ADD_CONTACT);
    }

    private final ArrayList<Contact> sortContactsBy(ArrayList<Contact> input, String sortOrder) {
        if (s.f(sortOrder, EContextPaymentMethod.FIRST_NAME)) {
            final p pVar = new p() { // from class: expo.modules.contacts.a
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(ContactsModule.sortContactsBy$lambda$41((Contact) obj, (Contact) obj2));
                }
            };
            v.C(input, new Comparator() { // from class: expo.modules.contacts.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ContactsModule.sortContactsBy$lambda$42(pVar, obj, obj2);
                }
            });
            return input;
        }
        if (s.f(sortOrder, EContextPaymentMethod.LAST_NAME)) {
            final p pVar2 = new p() { // from class: expo.modules.contacts.c
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(ContactsModule.sortContactsBy$lambda$43((Contact) obj, (Contact) obj2));
                }
            };
            v.C(input, new Comparator() { // from class: expo.modules.contacts.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ContactsModule.sortContactsBy$lambda$44(pVar2, obj, obj2);
                }
            });
        }
        return input;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$41(Contact contact, Contact contact2) {
        return t.C(contact.getFinalFirstName(), contact2.getFinalFirstName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$42(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$43(Contact contact, Contact contact2) {
        return t.C(contact.getFinalLastName(), contact2.getFinalLastName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$44(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        Boolean bool;
        AsyncFunctionComponent stringAsyncFunctionComponent4;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent5;
        Boolean bool2;
        AsyncFunctionComponent stringAsyncFunctionComponent6;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent3;
        Class cls2;
        AsyncFunctionComponent stringAsyncFunctionComponent7;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent4;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoContacts");
            boolean zF = s.f(Promise.class, Promise.class);
            Class cls3 = Integer.TYPE;
            Class cls4 = Float.TYPE;
            Class cls5 = Double.TYPE;
            Class cls6 = Boolean.TYPE;
            if (zF) {
                stringAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$1
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
                cls = ContactQuery.class;
                moduleDefinitionBuilder = moduleDefinitionBuilder;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                cls = ContactQuery.class;
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls6)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, lVar);
                }
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", stringAsyncFunctionComponent);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls6)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", asyncFunctionWithPromiseComponent);
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            co0.d dVarB = o0.b(cls);
            Boolean bool3 = Boolean.FALSE;
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool3));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(cls), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ContactQuery.class);
                    }
                }), converters3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getContactsAsync", new AsyncFunctionWithPromiseComponent("getContactsAsync", new AnyType[]{anyType3}, new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunctionWithPromise$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws MissingPermissionException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    ContactQuery contactQuery = (ContactQuery) objArr[0];
                    this.this$0.ensureReadPermission();
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$3$1(contactQuery, promise, this.this$0, null), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws MissingPermissionException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r2), bool3));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(Map.class), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        co0.s.Companion companion = co0.s.INSTANCE;
                        return o0.q(Map.class, companion.d(o0.o(String.class)), companion.d(o0.o(Object.class)));
                    }
                }), converters4);
            }
            co0.d dVarB2 = o0.b(String.class);
            Boolean bool4 = Boolean.TRUE;
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool4));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters4);
            }
            AnyType[] anyTypeArr3 = {anyType4, anyType5};
            l<Object[], String> lVar3 = new l<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$9
                @Override // wn0.l
                public final String invoke(Object[] objArr) throws AddContactException, MissingPermissionException, RemoteException, Exceptions.ReactContextLost, OperationApplicationException {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    this.this$0.ensurePermissions();
                    ContentProviderResult[] contentProviderResultArrApplyBatch = this.this$0.getResolver().applyBatch("com.android.contacts", this.this$0.mutateContact(null, (Map) obj).toInsertOperationList());
                    s.j(contentProviderResultArrApplyBatch, "applyBatch(...)");
                    if (contentProviderResultArrApplyBatch.length == 0) {
                        throw new AddContactException();
                    }
                    ContentResolver resolver = this.this$0.getResolver();
                    Uri uri = contentProviderResultArrApplyBatch[0].uri;
                    s.h(uri);
                    Cursor cursorQuery = resolver.query(uri, new String[]{Columns.CONTACT_ID}, null, null, null);
                    try {
                        if (cursorQuery == null) {
                            throw new RetrieveIdException();
                        }
                        cursorQuery.moveToNext();
                        String strValueOf = String.valueOf(cursorQuery.getLong(0));
                        sn0.b.a(cursorQuery, null);
                        return strValueOf;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
            };
            if (s.f(String.class, cls3)) {
                stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("addContactAsync", anyTypeArr3, lVar3);
            } else if (s.f(String.class, cls6)) {
                stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("addContactAsync", anyTypeArr3, lVar3);
            } else if (s.f(String.class, cls5)) {
                stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("addContactAsync", anyTypeArr3, lVar3);
            } else if (s.f(String.class, cls4)) {
                stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("addContactAsync", anyTypeArr3, lVar3);
            } else {
                stringAsyncFunctionComponent3 = s.f(String.class, String.class) ? new StringAsyncFunctionComponent("addContactAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("addContactAsync", anyTypeArr3, lVar3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("addContactAsync", stringAsyncFunctionComponent3);
            Class cls7 = r2;
            if (s.f(cls7, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("updateContactAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$10
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws ContactUpdateException, MissingPermissionException, ContactNotFoundException, RemoteException, OperationApplicationException {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Map map = (Map) promise;
                        this.this$0.ensurePermissions();
                        Contact contactById = this.this$0.getContactById(map.containsKey("id") ? (String) map.get("id") : null, ContactsModuleKt.defaultFields);
                        if (contactById == null) {
                            throw new ContactNotFoundException();
                        }
                        ContentProviderResult[] contentProviderResultArrApplyBatch = this.this$0.getResolver().applyBatch("com.android.contacts", this.this$0.mutateContact(contactById, map).toUpdateOperationList());
                        s.j(contentProviderResultArrApplyBatch, "applyBatch(...)");
                        if (contentProviderResultArrApplyBatch.length == 0) {
                            throw new ContactUpdateException();
                        }
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws ContactUpdateException, MissingPermissionException, ContactNotFoundException, RemoteException, OperationApplicationException {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
                AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls7), bool3));
                if (anyType6 == null) {
                    anyType6 = new AnyType(new LazyKType(o0.b(cls7), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$11
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            co0.s.Companion companion = co0.s.INSTANCE;
                            return o0.q(Map.class, companion.d(o0.o(String.class)), companion.d(o0.o(Object.class)));
                        }
                    }), converters5);
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("updateContactAsync", new AnyType[]{anyType6}, new l<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$12
                    @Override // wn0.l
                    public final String invoke(Object[] objArr) throws ContactUpdateException, MissingPermissionException, ContactNotFoundException, RemoteException, OperationApplicationException {
                        s.k(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        this.this$0.ensurePermissions();
                        String str = map.containsKey("id") ? (String) map.get("id") : null;
                        Contact contactById = this.this$0.getContactById(str, ContactsModuleKt.defaultFields);
                        if (contactById == null) {
                            throw new ContactNotFoundException();
                        }
                        ContentProviderResult[] contentProviderResultArrApplyBatch = this.this$0.getResolver().applyBatch("com.android.contacts", this.this$0.mutateContact(contactById, map).toUpdateOperationList());
                        s.j(contentProviderResultArrApplyBatch, "applyBatch(...)");
                        if (contentProviderResultArrApplyBatch.length == 0) {
                            throw new ContactUpdateException();
                        }
                        return str;
                    }
                });
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent);
            if (s.f(String.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("removeContactAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$13
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws MissingPermissionException {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        this.this$0.ensurePermissions();
                        this.this$0.getResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, (String) promise), null, null);
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws MissingPermissionException {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
                bool = bool4;
                bool3 = bool3;
            } else {
                TypeConverterProvider converters6 = moduleDefinitionBuilder.getConverters();
                AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
                if (anyType7 == null) {
                    bool = bool4;
                    anyType7 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$14
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.g(String.class);
                        }
                    }), converters6);
                } else {
                    bool = bool4;
                }
                AnyType[] anyTypeArr4 = {anyType7};
                l<Object[], Integer> lVar4 = new l<Object[], Integer>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$15
                    @Override // wn0.l
                    public final Integer invoke(Object[] objArr) throws MissingPermissionException {
                        s.k(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        this.this$0.ensurePermissions();
                        return Integer.valueOf(this.this$0.getResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str), null, null));
                    }
                };
                if (s.f(Integer.class, cls3)) {
                    stringAsyncFunctionComponent4 = new IntAsyncFunctionComponent("removeContactAsync", anyTypeArr4, lVar4);
                } else if (s.f(Integer.class, cls6)) {
                    stringAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("removeContactAsync", anyTypeArr4, lVar4);
                } else if (s.f(Integer.class, cls5)) {
                    stringAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("removeContactAsync", anyTypeArr4, lVar4);
                } else if (s.f(Integer.class, cls4)) {
                    stringAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("removeContactAsync", anyTypeArr4, lVar4);
                } else {
                    stringAsyncFunctionComponent4 = s.f(Integer.class, String.class) ? new StringAsyncFunctionComponent("removeContactAsync", anyTypeArr4, lVar4) : new UntypedAsyncFunctionComponent("removeContactAsync", anyTypeArr4, lVar4);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent4;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("removeContactAsync", asyncFunctionWithPromiseComponent2);
            TypeConverterProvider converters7 = moduleDefinitionBuilder.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$16
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters7);
            }
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$17
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters7);
            }
            AnyType[] anyTypeArr5 = {anyType8, anyType9};
            l<Object[], h0> lVar5 = new l<Object[], h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$18
                @Override // wn0.l
                public final h0 invoke(Object[] objArr) throws LookupKeyNotFoundException, Exceptions.ReactContextLost {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    String lookupKeyForContactId = this.this$0.getLookupKeyForContactId((String) obj);
                    if (lookupKeyForContactId == null) {
                        throw new LookupKeyNotFoundException();
                    }
                    Uri uriWithAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/x-vcard");
                    intent.putExtra("android.intent.extra.STREAM", uriWithAppendedPath);
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    this.this$0.getCurrentActivity().startActivity(intent);
                    return h0.f84049a;
                }
            };
            if (s.f(h0.class, cls3)) {
                stringAsyncFunctionComponent5 = new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr5, lVar5);
            } else if (s.f(h0.class, cls6)) {
                stringAsyncFunctionComponent5 = new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr5, lVar5);
            } else if (s.f(h0.class, cls5)) {
                stringAsyncFunctionComponent5 = new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr5, lVar5);
            } else if (s.f(h0.class, cls4)) {
                stringAsyncFunctionComponent5 = new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr5, lVar5);
            } else {
                stringAsyncFunctionComponent5 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr5, lVar5) : new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr5, lVar5);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("shareContactAsync", stringAsyncFunctionComponent5);
            if (s.f(cls7, Promise.class)) {
                asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("writeContactToFileAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$19
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws LookupKeyNotFoundException, MissingPermissionException, Exceptions.ReactContextLost {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Map map = (Map) promise;
                        this.this$0.ensureReadPermission();
                        String lookupKeyForContactId = this.this$0.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId == null) {
                            throw new LookupKeyNotFoundException();
                        }
                        Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws LookupKeyNotFoundException, MissingPermissionException, Exceptions.ReactContextLost {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
                cls7 = cls7;
                bool2 = bool3;
            } else {
                TypeConverterProvider converters8 = moduleDefinitionBuilder.getConverters();
                bool2 = bool3;
                AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls7), bool2));
                if (anyType10 == null) {
                    anyType10 = new AnyType(new LazyKType(o0.b(cls7), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$20
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            co0.s.Companion companion = co0.s.INSTANCE;
                            return o0.q(Map.class, companion.d(o0.o(String.class)), companion.d(o0.g(Object.class)));
                        }
                    }), converters8);
                }
                AnyType[] anyTypeArr6 = {anyType10};
                l<Object[], String> lVar6 = new l<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$21
                    @Override // wn0.l
                    public final String invoke(Object[] objArr) throws LookupKeyNotFoundException, MissingPermissionException, Exceptions.ReactContextLost {
                        s.k(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        this.this$0.ensureReadPermission();
                        String lookupKeyForContactId = this.this$0.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId != null) {
                            return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                        }
                        throw new LookupKeyNotFoundException();
                    }
                };
                if (s.f(String.class, cls3)) {
                    stringAsyncFunctionComponent6 = new IntAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr6, lVar6);
                } else if (s.f(String.class, cls6)) {
                    stringAsyncFunctionComponent6 = new BoolAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr6, lVar6);
                } else if (s.f(String.class, cls5)) {
                    stringAsyncFunctionComponent6 = new DoubleAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr6, lVar6);
                } else if (s.f(String.class, cls4)) {
                    stringAsyncFunctionComponent6 = new FloatAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr6, lVar6);
                } else {
                    stringAsyncFunctionComponent6 = s.f(String.class, String.class) ? new StringAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr6, lVar6) : new UntypedAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr6, lVar6);
                }
                asyncFunctionWithPromiseComponent3 = stringAsyncFunctionComponent6;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("writeContactToFileAsync", asyncFunctionWithPromiseComponent3);
            TypeConverterProvider converters9 = moduleDefinitionBuilder.getConverters();
            Boolean bool5 = bool;
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool5));
            if (anyType11 == null) {
                cls2 = String.class;
                anyType11 = new AnyType(new LazyKType(o0.b(cls2), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunctionWithPromise$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters9);
            } else {
                cls2 = String.class;
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls7), bool5));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(o0.b(cls7), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunctionWithPromise$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        co0.s.Companion companion = co0.s.INSTANCE;
                        return o0.i(Map.class, companion.d(o0.o(String.class)), companion.d(o0.o(Object.class)));
                    }
                }), converters9);
            }
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls7), bool5));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(o0.b(cls7), true, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunctionWithPromise$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        co0.s.Companion companion = co0.s.INSTANCE;
                        return o0.i(Map.class, companion.d(o0.o(String.class)), companion.d(o0.g(Object.class)));
                    }
                }), converters9);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("presentFormAsync", new AsyncFunctionWithPromiseComponent("presentFormAsync", new AnyType[]{anyType11, anyType12, anyType13}, new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunctionWithPromise$6
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws IllegalAccessException, ContactManipulationInProgressException, MissingPermissionException, ContactNotFoundException, InstantiationException, InvocationTargetException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Map map = (Map) obj2;
                    String str = (String) obj;
                    this.this$0.ensureReadPermission();
                    if (this.this$0.contactManipulationPromise != null) {
                        throw new ContactManipulationInProgressException();
                    }
                    if (str != null) {
                        Contact contactById = this.this$0.getContactById(str, ContactsModuleKt.defaultFields);
                        if (contactById == null) {
                            throw new ContactNotFoundException();
                        }
                        this.this$0.presentEditForm(contactById, promise);
                    }
                    if (map != null) {
                        this.this$0.presentForm(this.this$0.mutateContact(null, map), promise);
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IllegalAccessException, ContactManipulationInProgressException, MissingPermissionException, ContactNotFoundException, InstantiationException, InvocationTargetException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.ON_ACTIVITY_RESULT;
            eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new p<Activity, OnActivityResultPayload, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$OnActivityResult$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                    invoke2(activity, onActivityResultPayload);
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                    Promise promise;
                    Uri data;
                    s.k(sender, "sender");
                    s.k(payload, "payload");
                    int requestCode = payload.getRequestCode();
                    int resultCode = payload.getResultCode();
                    Intent data2 = payload.getData();
                    if (requestCode == 2137 || requestCode == 2139) {
                        Promise promise2 = this.this$0.contactManipulationPromise;
                        if (promise2 == null) {
                            return;
                        }
                        promise2.resolve(0);
                        this.this$0.contactManipulationPromise = null;
                    }
                    if (requestCode != 2138 || (promise = this.this$0.contactPickingPromise) == null) {
                        return;
                    }
                    if (resultCode == -1) {
                        Contact contactById = this.this$0.getContactById((data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment(), ContactsModuleKt.defaultFields);
                        promise.resolve(contactById != null ? contactById.toMap(ContactsModuleKt.defaultFields) : null);
                    } else {
                        promise.resolve();
                    }
                    this.this$0.contactPickingPromise = null;
                }
            }));
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent4 = new AsyncFunctionWithPromiseComponent("presentContactPickerAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$22
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws ContactPickingInProgressException {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws ContactPickingInProgressException {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (this.this$0.contactPickingPromise != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        this.this$0.contactPickingPromise = promise;
                        this.this$0.getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                    }
                });
            } else {
                TypeConverterProvider converters10 = moduleDefinitionBuilder.getConverters();
                AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Promise.class), bool2));
                if (anyType14 == null) {
                    anyType14 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$23
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters10);
                }
                AnyType[] anyTypeArr7 = {anyType14};
                l<Object[], h0> lVar7 = new l<Object[], h0>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$13$$inlined$AsyncFunction$24
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) throws ContactPickingInProgressException {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.contactPickingPromise != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        this.this$0.contactPickingPromise = promise;
                        this.this$0.getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent7 = new IntAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr7, lVar7);
                } else if (s.f(h0.class, cls6)) {
                    stringAsyncFunctionComponent7 = new BoolAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr7, lVar7);
                } else if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent7 = new DoubleAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr7, lVar7);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent7 = new FloatAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr7, lVar7);
                } else {
                    stringAsyncFunctionComponent7 = s.f(h0.class, cls2) ? new StringAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr7, lVar7) : new UntypedAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr7, lVar7);
                }
                asyncFunctionWithPromiseComponent4 = stringAsyncFunctionComponent7;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("presentContactPickerAsync", asyncFunctionWithPromiseComponent4);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
