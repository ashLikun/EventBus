/*
 * Copyright (C) 2015 Mr.Simple <bboyfeiyu@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ashlikun.eventbus;

/**
 * <p>
 * 该类是描述一个函数唯一性的对象，参数类型、tag两个条件保证了对象的唯一性.通过该类的对象来查找注册了相应类型和tag的所有订阅者{@see
 * Subscription}, 并且在接到消息时调用所有订阅者对应的函数.
 *
 * @author mrsimple
 */
public final class EventData {
    /**
     * 默认的tag
     */
    public static final String DEFAULT_TAG = "default_tag";
    /**
     * 默认的方法参数
     */
    public static final String DEFAULT_EVENT = "-8888888810086";

    /**
     * 函数的tag
     */
    public String tag = DEFAULT_TAG;

    public Object event;

    public EventData(Object event, String aTag) {
        tag = aTag;
        this.event = event;
    }

    @Override
    public String toString() {
        return "EventType [paramClass=" + (event != null ? event.getClass().getName() : "null") + ", tag=" + tag + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((event == null) ? 0 : event.hashCode());
        result = prime * result + ((tag == null) ? 0 : tag.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventData other = (EventData) obj;
        if (tag == null) {
            if (other.tag != null)
                return false;
        } else if (!tag.equals(other.tag))
            return false;
        return true;
    }

}
