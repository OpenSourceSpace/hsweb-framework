/*
 *  Copyright 2016 http://www.hswebframework.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package org.hswebframework.web.authorization.oauth2.server.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 *
 * @author zhouhao
 */
@Getter
@Setter
public class SimpleOAuth2AccessEntity implements OAuth2AccessEntity {

    private static final long serialVersionUID = 2090466474249489203L;
    private String clientId;

    private String ownerId;

    private String accessToken;

    private String refreshToken;

    private Integer expiresIn;

    private Long createTime;

    private Long updateTime;

    private Set<String> scope;

    private String grantType;

}
