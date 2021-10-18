interface UserInfo{
    name: string;
    /** @deprecated use gender field instead */
    address: string;
}

declare const userInfo: UserInfo;
userInfo.address;