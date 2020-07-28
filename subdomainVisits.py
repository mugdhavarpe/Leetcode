class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        count_of_domain = {}
        for domain in cpdomains:
            count,words = domain.split()
            words_in_words = words.split('.')
            count = int(count)
            for i in range(len(words_in_words)):
                try:
                    count_of_domain[".".join(words_in_words[i:])] += count
                except KeyError:
                    count_of_domain[".".join(words_in_words[i:])] = count
        return["{} {}".format(total_count,dm)for dm, total_count in count_of_domain.items()]
            
