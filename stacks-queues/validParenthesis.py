#https://devsnest.in/algo-challenges/valid-parentheses
def solve(str):
    # CODE HERE
    st = [];
    m = {
        "(" : ")",
        "{" : "}",
        "[" : "]"
    }

    for el in str:
        if el in m:
            st.append(el)
        else:
            if len(st) == 0:
                return 0
            else:
                if m[st[-1]] == el:
                    st.pop()
                else:
                    return 0
    
    return 1 if len(st)==0 else 0;