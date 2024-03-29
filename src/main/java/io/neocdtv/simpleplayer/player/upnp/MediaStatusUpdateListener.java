/*
 * Copyright 2015 xix.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.neocdtv.simpleplayer.player.upnp;

/**
 *
 * @author xix
 */
public interface MediaStatusUpdateListener {
    public void handleEvent(final MediaStatusUpdateEvent mediaStatusUpdateEvent);
    
    @Override
    public boolean equals(Object other);

    @Override
    public int hashCode();

}
