private val Any.variablesMap by lazy {
    val mutableMap: MutableMap <String, Any> = mutableMapOf()
    mutableMap
}

@Suppress("UNCHECKED_CAST")
class PropertyExtensionDelegation<out T>{
    operator fun getValue(thisRef: Any?, property: KProperty<*>) : T = (thisRef?.variablesMap?.get(property.toString())) as T
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        thisRef?.variablesMap?.set(property.toString(), value)
    }
}
